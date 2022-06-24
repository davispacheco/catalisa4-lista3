package exerciciosEstruturaDecisao.exercicio1;

import java.sql.Array;
import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = input.nextInt();
        }
        input.close();
        int resultado;
        if (numeros[0] == numeros[1]) {
            resultado = 0;
        } else if (numeros[0] > numeros[1]) {
            resultado = numeros[0];
        } else {
            resultado = numeros[1];
        }
        if (resultado == 0) {
            System.out.println("Os dois números são iguais.");
        } else {
            System.out.println("Entre os números " + numeros[0] + " e " + numeros[1] + ", o maior deles é: " + resultado);
        }
    }
}
