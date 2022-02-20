package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                //classe randon, classe que gera numeros aleatorios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(1000);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numero aleatorios");
        for (int numero: numerosAleatorios) {
            System.out.print(" Code: "+numero);
        }

        System.out.println();
        System.out.println("Sucessores dos numeros aleatorios");
        for (int numero: numerosAleatorios) {
            System.out.print(" Code: "+(numero+1));
        }
    }
}
