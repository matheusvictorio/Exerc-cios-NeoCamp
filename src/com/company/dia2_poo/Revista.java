package com.company.dia2_poo;

public class Revista extends Livro{
    private int edicao;

    public Revista (String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Edicao: " + edicao);
    }
}
