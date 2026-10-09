package ex06_mediaNotas;

import java.util.Scanner;

public class ex06 {
    static void main() {
//        Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

        Scanner input = new Scanner(System.in);

        System.out.println("Insira as notas:");
//        double nota1 = input.nextDouble();
//        double nota2 = input.nextDouble();
//        double nota3 = input.nextDouble();

        double[] notas = {input.nextDouble(), input.nextDouble(), input.nextDouble()};
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
            if(i == notas.length - 1){
                double media = somaNotas / notas.length;
                System.out.println("Média do Aluno: "+media);
            }
        }
    }
}
