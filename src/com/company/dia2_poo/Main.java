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

        Optional<Item> resultado = biblioteca.buscarLivro(titulo);
        if (resultado.isPresent()) {
            //pensei em usar direto o resultado.get(), porém isso apenas mostraria o toString da classe Livro e não seu metodo exibir detalhes
            System.out.println("Livro encontrado: ");
            resultado.get().exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado!");
        }

        System.out.println("\n");
        Item revista = new Revista("Revista", "Autor revista", 2018, 12);
        revista.exibirDetalhes();
        // por conta do polimorfismo não foi necessário nenhuma modificação
        biblioteca.adicionarLivro(revista);
        System.out.println("\nLivros na biblioteca:");
        biblioteca.listarLivros();

        Item item1 = new Livro("itemlivro", "Matheus", 2010);
        Item item2 = new Revista("itemrevista", "Gabi", 2023, 512);

        item1.exibirDetalhes();
        System.out.println("Tipo: " + item1.tipo());
        System.out.println();

        item2.exibirDetalhes();
        System.out.println("Tipo: " + item2.tipo());
    }
}
