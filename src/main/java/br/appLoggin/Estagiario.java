package br.appLoggin;

public class Estagiario extends Funcionario{
    private double bolsa;

    public Estagiario(String nome ,double salarioBase, double bolsa) {
        super(nome, salarioBase);
        this.bolsa = bolsa;
    }

    @Override
    public double calcularSalario() {
        salarioBase = salarioBase + bolsa;
        return bolsa;
    }
}
