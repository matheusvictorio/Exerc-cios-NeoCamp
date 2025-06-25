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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao >= 0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            throw new IllegalArgumentException("Ano de publicacao não pode ser negativo");
        }

    }

    public void exibirDetalhes() {
        System.out.println("Nome do livro: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicacao);
    }

}
