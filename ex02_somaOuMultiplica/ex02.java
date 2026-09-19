package ex02_somaOuMultiplica;

import java.util.Scanner;

public class ex02 {
    static void main() {
//        Faça um algoritmo que leia dois valores inteiros A e B. Se forem iguais, some os dois.
//        Caso contrário, multiplique A por B. Atribua o resultado a C e imprima.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite Valor A:");
        int valorA = input.nextInt();
        System.out.println("Digite Valor B:");
        int valorB = input.nextInt();
        int valorC;

        if(valorA == valorB){
            valorC = valorA + valorB;
            System.out.println("Valores Iguais - Resultado Somado: "+valorC);
        }else{
            valorC = valorA * valorB;
            System.out.println("Valores Diferentes - Resultado Multiplicado: "+valorC);
        }



    }
}
