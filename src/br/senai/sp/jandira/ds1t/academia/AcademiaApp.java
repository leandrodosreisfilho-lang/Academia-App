package br.senai.sp.jandira.ds1t.academia;

import br.senai.sp.jandira.ds1t.academia.model.AlunoAcademia;

public class AcademiaApp {
    public static void main (String[] args) {
        System.out.println("Iniciando...");

        AlunoAcademia media = new AlunoAcademia();
        media.obterDados();
    }
}
