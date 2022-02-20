package br.com.dio.exercicios.arrays;

import java.util.Random;

public class EX_ArrayMultiDimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numerosAleatorios = new int[4][4]; // sempre atribuir new int

        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int a = 0; a < numerosAleatorios.length; a++){
                numerosAleatorios[i][a] = random.nextInt(87000);
            }
        }

        for (int[] linha : numerosAleatorios){
            for (int coluna: linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
/*
        int num = 5, count = 1;

        while(count <= 3) {

            ++count;

            num += count;

        }

        System.out.println(num);

        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};

        System.out.print(numeros[2][2]);
*/



    }
}
