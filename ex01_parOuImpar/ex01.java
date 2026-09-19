package ex01_parOuImpar;

import java.util.Scanner;

public class ex01 {
    static void main() {
//        Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        if(numero == 0){
            System.out.println("O número "+numero+" é Neutro e Par");
        }
        else if(numero >= 0 || numero %2 == 0){
            System.out.println("O número "+numero+" é Positivo e Par");
        }else if(numero >= 0){
            System.out.println("O número "+numero+" é Positivo e Ímpar");
        }else if(numero <0 || numero % 2 ==0){
            System.out.println("O número "+numero+" é Negativo e Par");
        }else{
            System.out.println("O número "+numero+" é Negativo e Ímpar");
        }

    }
}
