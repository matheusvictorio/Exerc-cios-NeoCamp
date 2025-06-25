package com.company.dia2_poo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }


    public void exibirDetalhes() {
        System.out.println("Nome do livro: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicacao);
    }
}
