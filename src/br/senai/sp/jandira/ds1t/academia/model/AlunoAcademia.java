package br.senai.sp.jandira.ds1t.academia.model;

import java.util.Scanner;

public class AlunoAcademia {
    String nomeDoAluno;
    double altura;
    double peso;
    double resultadoIMC;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------");

        System.out.println("NOME DO ALUNO: ");
        nomeDoAluno = leitor.nextLine();

        System.out.println("ALTURA DO ALUNO: ");
        altura = leitor.nextDouble();

        System.out.println("PESO DO ALUNO: ");
        peso = leitor.nextDouble();

        System.out.println("-----------RESULTADO-----------");

        calcularIMC();
        exibirDados();
        exibirClassificacaoDeSaude();

        System.out.println("------------------------");

    }

    public void calcularIMC(){
        resultadoIMC = peso / (altura * altura);
    }

    public void exibirDados(){
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("Imc calculado: " + resultadoIMC);
    }

    public void exibirClassificacaoDeSaude(){
        if (resultadoIMC < 18.6){
            System.out.println("Status: Abaixo do peso");

        } else if (resultadoIMC >= 18.6 && resultadoIMC < 25.0) {
            System.out.println("Status: Peso ideal (Parabens)");

        } else if (resultadoIMC >= 25.0 && resultadoIMC < 30.0) {
            System.out.println("Status: Levemente acima do peso");

        } else if (resultadoIMC >= 30.0 && resultadoIMC < 35.0) {
            System.out.println("Status: Obesidade grau 1");

        } else if (resultadoIMC >= 35.0 && resultadoIMC < 40.0) {
            System.out.println("Status: Obesidade grau 2 (Severa)");

        } else {
            System.out.println("Status: Obesidade grau 3 (Mórbida)");

        }
    }
}
