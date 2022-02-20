package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroParagerarTabuada;


        System.out.println("Digite o numero para gerar a taboada");
        numeroParagerarTabuada = scan.nextInt();

        for (int i = 1; i <= 10;i++){
            System.out.println(numeroParagerarTabuada +" x "+ i +" = "+ (numeroParagerarTabuada*i) );
        }




    }
}
