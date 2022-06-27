package exerciciosEstruturaRepeticao.exercicio7;

import java.util.Scanner;

public class VerificadorNumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo:");
        int numero = input.nextInt();
        input.close();
        if (numero <= 0) {
            System.out.println("Número inválido, escolha outro.");
        } else {
            int contadorPrimo = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorPrimo++;
                }
            }
            if (contadorPrimo == 2) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
    }
}
