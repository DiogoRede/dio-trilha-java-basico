import java.util.Scanner;

import models.ContaBanco;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Numero da Agencia
        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("Usuário: ");
        int numeroAgencia = Integer.parseInt(input.nextLine());

        // Nome da Agencia
        System.out.println("Por favor, digite o nome da Agência!");
        System.out.print("Usuário: ");
        String nomeAgencia = input.nextLine();

        // Nome Cliente
        System.out.println("Por favor, digite o nome do Cliente!");
        System.out.print("Usuário: ");
        String nomeCliente = input.nextLine();

        // Saldo
        System.out.println("Por favor, digite o saldo!");
        System.out.print("Usuário: ");
        double saldoCliente = input.nextInt();

        ContaBanco conta = new ContaBanco(numeroAgencia, nomeAgencia, nomeCliente, saldoCliente);
        conta.messageWelcome();

        input.close();
    }
}