package main;

import main.domains.Banco;
import main.domains.Cliente;
import main.domains.Conta;
import main.domains.ContaCorrente;
import main.domains.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Santander");

        Cliente cliente = new Cliente("Diogo");
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        banco.adicionarConta(contaPoupanca);
        banco.adicionarConta(contaCorrente);

        contaCorrente.depositar(100);
        contaCorrente.transferir(contaPoupanca, 90);

        banco.buscarPorAgencia(1);
    }
}