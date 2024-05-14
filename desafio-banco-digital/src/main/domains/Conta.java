package main.domains;

import main.interfaces.ContaStrategy;

public abstract class Conta implements ContaStrategy{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int id;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.id = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    protected void imprimirInformacoes() {
        System.out.println("[id=" + id + ", agencia=" + agencia + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]");
    }

    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }
    public int getId() {
        return id;
    }
    public double getSaldo() {
        return saldo;
    }

}