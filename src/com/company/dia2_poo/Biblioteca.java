package com.company.dia2_poo;

import java.util.ArrayList;
import java.util.Optional;

public class Biblioteca {
    ArrayList<Item> itens = new ArrayList<>();

    public void adicionarLivro(Item item) {
        itens.add(item);
    }

    public void listarLivros() {
        for (Item i : itens) {
            i.exibirDetalhes();
            System.out.println("\n");
        }
    }

    public Optional<Item> buscarLivro(String titulo) {
        return itens.stream()
                .filter(i -> i.getTitulo()
                        .equalsIgnoreCase(titulo))
                .findFirst();
    }
}
