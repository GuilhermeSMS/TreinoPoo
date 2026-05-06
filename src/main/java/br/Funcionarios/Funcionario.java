package br.Funcionarios;

public abstract class Funcionario {

    private String nome;
    protected double salarioBase = 5000;

    public abstract double calcularSalario();

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }



}
