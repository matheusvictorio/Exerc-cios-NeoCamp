package com.company;

import java.util.Scanner;

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
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
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
}
