package ex05_imc;

import java.util.Scanner;

public class ex05 {
    static void main() {
//        Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura,
//        e imprima na tela sua condição de acordo com a tabela:
//        abaixo de 18,5 (abaixo do peso),
//        entre 18,6 e 24,9 (peso ideal),
//        entre 25 e 29,9 (acima),
//        entre 30 e 34,9 (obesidade I),
//        entre 35 e 39,9 (obesidade II),
//        >= 40 (obesidade III).

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu peso (Kg):");
        double peso = input.nextDouble();
        System.out.println("Informe sua altura (m):");
        double altura = input.nextDouble();

        double imc = peso / (altura*altura);

        if (imc <= 18.5) {
            System.out.println("Seu IMC é "+imc+", indicando que você está Abaixo do Peso");
        } else if (imc <= 24.9) {
            System.out.println("Seu IMC é "+imc+", indicando que você está no Peso Ideal");
        } else if (imc <= 29.9) {
            System.out.println("Seu IMC é "+imc+", indicando que você está Acima do Peso");
        } else if (imc <= 34.9) {
            System.out.println("Seu IMC é "+imc+", indicando que você está com Obesidade I");
        } else if (imc <= 39.9) {
            System.out.println("Seu IMC é "+imc+", indicando que você está com Obesidade II");
        } else {
            System.out.println("Seu IMC é "+imc+", indicando que você está com Obesidade III");
        }


    }
}
