package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador=0;

        do {
            System.out.println((contador+1) +"º Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))
            ){
                    consoantes[contador] = letra;
                    quantidadeConsoantes++;
            }

            contador++;
        }while (contador < consoantes.length);
        /*
        * For"each" e o laço de repetição que percorre no vetor que foi dado como referência do lado direito,
        * e atribuida na variavel do lado esquerdo
        * */
        for ( String consoante : consoantes ) {
            if (consoante != null)//para imprimir somente as consoantes, por que se não ele reproduzo vazio "null"
            System.out.print(consoante+" ");
        }

     }
}
