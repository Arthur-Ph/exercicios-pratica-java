package ex04_ordemDecrescente;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex04 {
    static void main() {
//        Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        Scanner input = new Scanner(System.in);
        System.out.println("Insira Valor 1:");
        int valor1 = input.nextInt();
        System.out.println("Insira Valor 2:");
        int valor2 = input.nextInt();
        System.out.println("Insira Valor 3:");
        int valor3 = input.nextInt();

        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);

        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i]+" / ");
        }
    }
}

