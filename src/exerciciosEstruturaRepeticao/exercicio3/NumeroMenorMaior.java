package exerciciosEstruturaRepeticao.exercicio3;

import java.util.Scanner;

public class NumeroMenorMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int respostaUsuario = input.nextInt();
            if (respostaUsuario <= 0) {
                System.out.println("Número inválido, escolha outro.");
            } else {
                numeros[i] = respostaUsuario;
            }
        }
        input.close();
        for (int i1 = 0; i1 < numeros.length - 1; i1++) {
            if (numeros[i1] > numeros[i1 + 1]) {
                int numeroMenor = numeros[i1 + 1];
                int numeroMaior = numeros[i1];
                numeros[i1] = numeroMenor;
                numeros[i1 + 1] = numeroMaior;
            }
            if (i1 > 0) {
                for (int i2 = 0; i2 < i1; i2++) {
                    if (numeros[i2] > numeros[i2 + 1]) {
                        int numeroMenor = numeros[i2 + 1];
                        int numeroMaior = numeros[i2];
                        numeros[i2] = numeroMenor;
                        numeros[i2 + 1] = numeroMaior;
                    }
                }
            }
        }
        System.out.println("Número menor lido: " + numeros[0]);
        System.out.println("Número maior lido: " + numeros[numeros.length - 1]);

    }
}