package br.senai.sp.jandira.ds1t.academia.model;

import java.util.Scanner;

public class AlunoAcademia {
    String nomeDoAluno;
    double altura;
    double peso;
    double resultadoIMC;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("------------------------");

        System.out.println("NOME DO ALUNO: ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("ALTURA DO ALUNO: ");
        altura = leitor.nextDouble();

        System.out.print("PESO DO ALUNO: ");
        peso = leitor.nextDouble();

        System.out.print("-----------RESULTADO-----------");

        calcularIMC();
        exibirDados();
        exibirClassificacaoDeSaude();

        System.out.print("------------------------");

    }

    public void calcularIMC(){
        resultadoIMC = peso / (altura * altura);
    }

    public void exibirDados(){
        System.out.print("Aluno: " + nomeDoAluno);
        System.out.print("Imc calculado: " + resultadoIMC);
    }

    public void exibirClassificacaoDeSaude(){
        if (resultadoIMC < 18.6){
            System.out.print("Status: Abaixo do peso");

        } else if (resultadoIMC >= 18.6 && resultadoIMC < 25.0) {
            System.out.print("Status: Peso ideal (Parabens)");

        } else if (resultadoIMC >= 25.0 && resultadoIMC < 30.0) {
            System.out.print("Status: Levemente acima do peso");

        } else if (resultadoIMC >= 30.0 && resultadoIMC < 35.0) {
            System.out.print("Status: Obesidade grau 1");

        } else if (resultadoIMC >= 35.0 && resultadoIMC < 40.0) {
            System.out.print("Status: Obesidade grau 2 (Severa)");

        } else {
            System.out.print("Status: Obesidade grau 3 (Mórbida)");

        }
    }
}
