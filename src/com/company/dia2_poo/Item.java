package com.company.dia2_poo;

public abstract class Item implements ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Item(String titulo, String autor, int anoPublicacao) {
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
        if (anoPublicacao > 0) {this.anoPublicacao = anoPublicacao;}
        else { throw new IllegalArgumentException("Ano de publicação deve ser maior que zero");}
    }

    public abstract String tipo();

}
