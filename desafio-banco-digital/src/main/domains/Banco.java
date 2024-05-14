package main.domains;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void buscarPorAgencia(int agencia){
        contas.stream()
            .filter(conta -> conta.getAgencia()==agencia)
            .forEach(conta-> conta.imprimirExtrato());
    }

    public void buscarPorIdConta(int id){
        contas.stream()
            .filter(conta -> conta.getId()==id)
            .findFirst()
            .get()
            .imprimirExtrato();
    }

    public void listarContas(){
        contas.stream()
            .forEach(conta -> conta.imprimirExtrato());
    }

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
}