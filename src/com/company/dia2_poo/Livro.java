package com.company.dia2_poo;

public class Livro extends Item{
    public Livro(String titulo, String autor, int anoPublicacao){
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome do livro: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de publicação: " + getAnoPublicacao());
    }

    @Override
    public String tipo() {
        return "Livro";
    }
}
