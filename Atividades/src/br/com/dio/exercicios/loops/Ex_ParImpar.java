package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_ParImpar {
    public static void main(String[] args) {
            Scanner scan = new  Scanner(System.in);

        int quantidadeNUmeros;
        int quantidadeDoDIgitado = 0;
        int numero;
        float restoDaDivisao = 0;
        int numeroPar = 0;
        int numeroImpar = 0;
        System.out.println("Quantos numeros iremos digitar ");
        quantidadeNUmeros = scan.nextInt();

        do {
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();
            restoDaDivisao = numero % 2;

            if (restoDaDivisao == 0){
                numeroPar++;
            }else{
                numeroImpar++;
            }
            quantidadeDoDIgitado++;
        }while (quantidadeDoDIgitado < quantidadeNUmeros);

        System.out.println(numeroPar +" Numero par Digitados.");
        System.out.println(numeroImpar +" Numero ImparDigitados.");


    }
}
