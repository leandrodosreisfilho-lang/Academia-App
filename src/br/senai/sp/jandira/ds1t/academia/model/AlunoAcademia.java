package br.senai.sp.jandira.ds1t.academia.model;

import java.util.Scanner;

public class AlunoAcademia {
    String nomeDoAluno;
    double altura;
    double peso;
    double resultadoIMC;

    public void exbirDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------");

        System.out.println("NOME DO ALUNO: ");
        nomeDoAluno = leitor.nextLine();

        System.out.println("ALTURA DO ALUNO: ");
        altura = leitor.nextDouble();

        System.out.println("PESO DO ALUNO: ");
        peso = leitor.nextDouble();

        resultadoIMC;

    };

    public void calcularIMC(){
        resultadoIMC = peso / (altura * altura);
    }

}
