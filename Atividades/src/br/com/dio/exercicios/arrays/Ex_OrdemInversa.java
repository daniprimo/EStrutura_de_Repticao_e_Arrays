package br.com.dio.exercicios.arrays;

public class Ex_OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {6, -5, 15, 50, 8, 4};

        System.out.println("Realizando atividade com for");

        System.out.println("Ordem Alocada");
        for (int z = 0;z <= (vetor.length-1) ; z++){
            System.out.print(vetor[z]+", ");
        }
        System.out.println();
        System.out.println("Ordem Inversa");
        for (int i = (vetor.length -1) ;i >= 0 ;i--){
            System.out.print(vetor[i]+", ");
        }

        System.out.println();
        System.out.println("Realizando atividade com While com a função length");
        int contador=0;

        while (contador < (vetor.length)){
            System.out.print(vetor[contador]+" ");
            contador++;

        }


    }

}
