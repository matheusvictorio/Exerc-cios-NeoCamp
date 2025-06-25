package com.company.dia2_poo;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<Livro> buscarLivro(String titulo) {
        return livros.stream()
                .filter(l -> l.getTitulo()
                        .equalsIgnoreCase(titulo))
                .findFirst();
    }
}
