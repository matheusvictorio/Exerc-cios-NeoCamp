package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("--- Menu de Operações ---");
            System.out.println("1. Calculadora");
            System.out.println("2. Verificar Par ou Ímpar");
            System.out.println("3. Calcular Fatorial");
            System.out.println("4. Mostrar Tabuada");
            System.out.println("5. Somar Matriz 3x3");
            System.out.println("6. Stream de Números (ímpar, dobrar, ordenar)");
            System.out.println("7. Map de Pessoas com Filtro de Idade");
            System.out.println("0. Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    double resultado = calculadora();
                    System.out.println(resultado);
                    break;
                case 2:
                    sc.nextLine();
                    parOuImpar();
                    break;
                case 3:
                    sc.nextLine();
                    fatorial();
                    break;
                case 4:
                    sc.nextLine();
                    tabuada();
                    break;
                case 5:
                    sc.nextLine();
                    matriz();
                    break;
                case 6:
                    sc.nextLine();
                    stream();
                    break;
                case 7:
                    sc.nextLine();
                    map();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (op != 0);
    }
    public static double calculadora(){
        System.out.println("Insira a operação que deseja realizar: (+, -, *, /)");
        sc.nextLine();
        String operation = sc.nextLine();

        System.out.println("Insira o primeiro número: ");
        double primeiro = sc.nextDouble();

        System.out.println("Insira o segundo número: ");
        double segundo = sc.nextDouble();

        switch (operation){
            case "+":
                return primeiro + segundo;
            case "-":
                return primeiro - segundo;
            case "*":
                    return primeiro * segundo;
            case "/":
                        return primeiro / segundo;
                default:
                    System.out.println("Operação Inválida!");
                    return Double.NaN;
        }
    }
    public static void parOuImpar(){
        System.out.println("Digite um número para verificar se ele é par ou ímpar: ");
        int number = sc.nextInt();
        if(number %2 == 0){
            System.out.println("O número: " + number + " é par!");
        } else {
            System.out.println("O número: " + number + " é ímpar!");
        }
    }

    public static void fatorial(){
        System.out.println("Digite um número para verificar seu fatorial: ");
        int number = sc.nextInt();
        int soma = 1;
        for(int i = number; i > 0; i--){
            soma  *= i;
        }
        System.out.println("O fatorial de " + number + " é: " + soma);
    }

    public static void tabuada(){
        System.out.println("Digite um número para mostrar sua tabuada do 1 ao 10: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int multiplicacao = number * i;
            System.out.println(number + " x " + i + " = " + multiplicacao);
        }
    }

    public static void matriz(){
        int[][]  matriz = new int[3][3];

        int somaTotal = 0;
        System.out.println("Digite os elementos da matriz 3x3: ");
        for(int i = 0; i < 3; i++){
            int somaLinha = 0;
            for(int j = 0; j < 3; j++){
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                somaLinha += matriz[i][j];
            }
            somaTotal += somaLinha;
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }
        System.out.println("Soma da matriz: " + somaTotal);
    }

    public static void stream(){
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Digite os números da lista:  (0 para parar) ");
        var number = sc.nextInt();
        while (number != 0) {
            numbers.add(number);
            number = sc.nextInt();
        }

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista final dos números ímpares dobrados e ordenados:");
        System.out.println(result);
    }

    public static void map(){
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Digite o nome e a idade das pessoas (digite 'fim' para parar):");
        while (true) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")) break;

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());
            map.put(nome, idade);
        }
        // pego o valor de entrada do map
        Set<String> filterMap = map.entrySet().stream()
                //pego a idade através do getValue e faço a comparação
                .filter(a -> a.getValue() > 30)
                //uso um metodo para transformar o map em apenas a chave, no caso o nome
                .map(Map.Entry::getKey)
                //Como foi pedido para utilizar Set a forma como eu achei foi usar o TreeSet, porém caso fosse List usaria o sorted() porém iria permitir nomes repetidos
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Pessoas com mais de 30 anos (ordenadas):");
        filterMap.forEach(System.out::println);

    }
}
