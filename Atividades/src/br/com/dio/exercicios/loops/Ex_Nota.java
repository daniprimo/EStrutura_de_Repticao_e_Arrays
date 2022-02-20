package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("insira uma nota entre 0 e 10");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Valor Invalido !! insira uma nota entre 0 e 10");
            nota = scan.nextInt();
        }


    }
}
