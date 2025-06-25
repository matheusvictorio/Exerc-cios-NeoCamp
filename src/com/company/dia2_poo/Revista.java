package com.company.dia2_poo;

public class Revista extends Item{
    private int edicao;

    public Revista (String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome do livro: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de publicação: " + getAnoPublicacao() + "\nEdicao: " + edicao);
    }

    @Override
    public String tipo() {
        return "Revista";
    }
}
