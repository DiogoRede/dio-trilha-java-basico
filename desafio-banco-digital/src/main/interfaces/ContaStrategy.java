package main.interfaces;

import main.domains.Conta;

public interface ContaStrategy {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(Conta contaDestino, double valor);
    public void imprimirExtrato();
}