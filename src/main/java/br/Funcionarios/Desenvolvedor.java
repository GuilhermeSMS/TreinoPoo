package br.Funcionarios;

public class Desenvolvedor extends Funcionario {
    private String nivelSenioridade;

    public Desenvolvedor(String nome, double salarioBase, String nivelSenioridade) {
        super(nome, salarioBase);
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public double calcularSalario() {
        if(nivelSenioridade.equalsIgnoreCase("Junior")) {
            salarioBase = salarioBase + 1000;
        } else if (nivelSenioridade.equalsIgnoreCase("Pleno")) {
            salarioBase = salarioBase + 2000;
        } else if (nivelSenioridade.equalsIgnoreCase("Senior")) {
            salarioBase =  salarioBase + 3000;
        }

        return salarioBase;
    }




}
