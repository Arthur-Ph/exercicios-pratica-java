package ex10_temperatura;

import java.util.Scanner;

public class ex10 {
    static void main() {
//        Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
//        Imprima as duas temperaturas. Fórmula: C = (5 * (F-32) / 9).

        Scanner input = new Scanner(System.in);

        double temperaturaF = input.nextDouble();
        double temperaturaC = 5*(temperaturaF-32)/9;

        System.out.println("Tempratura em Fahrenheit: "+temperaturaF);
        System.out.println("Tempratura em Celsius: "+temperaturaC);


    }
}
