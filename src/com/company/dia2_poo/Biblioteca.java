package com.company.dia2_poo;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            l.exibirDetalhes();
            System.out.println("\n");
        }
    }
}
