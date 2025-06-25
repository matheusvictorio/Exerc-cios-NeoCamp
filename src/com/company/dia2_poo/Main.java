package com.company.dia2_poo;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Lorem", "Autor0", 1954);
        Livro livro2 = new Livro("Teste", "Autor", 1899);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Livros na biblioteca:");
        biblioteca.listarLivros();

        System.out.println("Digite o título do livro que deseja buscar: ");
        String titulo = sc.nextLine();

        Optional<Livro> resultado = biblioteca.buscarLivro(titulo);
        if (resultado.isPresent()) {
            //pensei em usar direto o resultado.get(), porém isso apenas mostraria o toString da classe Livro e não seu metodo exibir detalhes
            System.out.println("Livro encontrado: ");
            resultado.get().exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado!");
        }
    }
}
