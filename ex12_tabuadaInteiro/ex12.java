package ex12_tabuadaInteiro;

import java.util.Scanner;

public class ex12 {
    static void main() {
//        Faça um algoritmo que imprima na tela a tabuada (1 a 10) de qualquer valor inteiro.

        Scanner input = new Scanner(System.in);
        
        int numero = input.nextInt();
        System.out.println("Tabuada do "+numero);
        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(numero+" x "+i+" = "+tabuada);
        }

    }
}
