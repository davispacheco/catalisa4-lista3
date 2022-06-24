package exerciciosEstruturaDecisao.exercicio3;

import java.util.Scanner;

public class CalculadoraMediaNotasParciaisAluno {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] notasParciais = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite sua " + (i + 1) + "ª nota:");
            notasParciais[i] = input.nextDouble();
        }
        input.close();
        double media = (notasParciais[0] + notasParciais[1]) / notasParciais.length;
        System.out.printf("Sua média é: %.1f", media);
        if (media == 10) {
            System.out.println("\nAprovado com distinção!");
        } else if (media >= 7) {
            System.out.println("\nAprovado.");
        } else {
            System.out.println("\nReprovado.");
        }
    }
}
