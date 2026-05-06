package br.Funcionarios;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario d = new Desenvolvedor("Guilherme", 4000, "Senior");
        Funcionario g = new Gerente("Catia", 4000, 1500);
        Funcionario e = new Estagiario("João",0, 800);
        funcionarios.add(d);
        funcionarios.add(g);
        funcionarios.add(e);
        System.out.println("O salario do(a) " +d.getNome()+ " é de: " + d.calcularSalario());
        System.out.println("O salario do(a) " +g.getNome()+ " é de: " + g.calcularSalario());
        System.out.println("O salario do(a) " +e.getNome()+ " é de: " + e.calcularSalario());

        double totalFolha = 0;
        for (Funcionario f : funcionarios){
            totalFolha += f.calcularSalario();
        }
        System.out.println("Total da folha: "+ totalFolha);


    }

}

