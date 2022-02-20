package br.com.dio.exercicios.loops;

// utilizando o Do While

import java.util.Scanner;

public class Ex_MaiorMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 1;
        int aux = 0;
        int soma = 0;


        do {
            System.out.println("Digite o "+ contador +"º Numero: ");
            numero = scan.nextInt();
            soma += numero;
            if (numero > aux) aux=numero;
            contador++;
        }while (contador <= 5);

        float media = soma / 5;

        System.out.println("O maior numero digitado é " + aux);
        System.out.println("A some dos numeros digitado é "+ soma);
        System.out.println("E a sua media é "+ media);

    }
}
