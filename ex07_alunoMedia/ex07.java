package ex07_alunoMedia;

import java.util.Scanner;

public class ex07 {
    static void main() {
//        Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média,
//        e imprima o nome do aluno e se foi aprovado ou reprovado (média >= 7).

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do Aluno:");
        String aluno = input.nextLine();
        System.out.println("Insira as notas:");
        double[] notas = {input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble()};
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;
        if (media >= 7) {
            System.out.println("O Aluno " + aluno + " com média " + media + " está Aprovado!");
        } else {
            System.out.println("O Aluno " + aluno + " com média " + media + " está Reprovado!");
        }
    }
}
