package br.appLoggin;

public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        salarioBase = salarioBase + bonus;
         return salarioBase;
    }
}
