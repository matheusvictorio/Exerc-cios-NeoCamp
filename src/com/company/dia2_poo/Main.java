package com.company.dia2_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Lorem", "Autor0", 1954);
        Livro livro2 = new Livro("Teste", "Autor", 1899);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Livros na biblioteca:");
        biblioteca.listarLivros();
    }
}
