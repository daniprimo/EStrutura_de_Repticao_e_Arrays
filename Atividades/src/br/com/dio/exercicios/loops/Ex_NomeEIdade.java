package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Função que irá possibilita inserir dados alt+enter import

        String nome;
        int idade;


        while (true) {// true verdadeiro para  realizar o loop
            System.out.println("Nome: ");
            nome = scan.next(); // para inserir dados na variavel deve utilizar o metodo next() da classe Scanner
            if (nome.equals("0")) break;// para parar laço
            System.out.println("Idade:");
            idade = scan.nextInt(); // nexInt() devido ser uma inserção de numero inteiro.

        }

        System.out.println("Continua Aqui....");

    }
}
