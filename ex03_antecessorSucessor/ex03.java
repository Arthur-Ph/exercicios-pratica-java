package ex03_antecessorSucessor;

import java.util.Scanner;

public class ex03 {
    static void main() {
//        Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        int valorAntecessor = numero -1;
        int valorSucessor = numero +1;

        System.out.println("Número Antecessor: "+valorAntecessor);
        System.out.println("Número Sucessor: "+valorSucessor);

    }
}
