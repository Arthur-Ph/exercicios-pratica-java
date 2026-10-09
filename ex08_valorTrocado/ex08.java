package ex08_valorTrocado;

import java.util.Scanner;

public class ex08 {
    static void main() {
//        Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A.
//        Imprima na tela os valores.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os Valores:");
        double valorA = input.nextDouble();
        double valorB = input.nextDouble();

        double variavelDeArmazenamento = valorA;
        valorA = valorB;
        valorB = variavelDeArmazenamento;

        System.out.println("Valor A Trocado: "+valorA);
        System.out.println("Valor B Trocado: "+valorB);
    }
}
