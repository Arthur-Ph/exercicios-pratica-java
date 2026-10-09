package ex09_tipoTriangulo;

import java.util.Scanner;

public class ex09 {
    static void main() {
//        Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
//        verifique se são válidos. Determine se o triângulo é equilátero, isósceles ou escaleno.

        Scanner input = new Scanner(System.in);

        System.out.println("Insira os valores do triângulo:");
        double ladoA = input.nextDouble();
        double ladoB = input.nextDouble();
        double ladoC = input.nextDouble();

        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoC + ladoB > ladoA){
            if(ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triângulo Equilátero");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("Triângulo Escaleno");
            }else {
                System.out.println("Triângulo Isósceles");
            }
        }else {
            System.out.println("Triângulo não pode existir!");
        }

    }
}
