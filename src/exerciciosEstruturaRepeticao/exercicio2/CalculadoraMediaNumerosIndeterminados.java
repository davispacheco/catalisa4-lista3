package exerciciosEstruturaRepeticao.exercicio2;

import java.util.Scanner;

public class CalculadoraMediaNumerosIndeterminados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe com quantos números deseja fazer a média:");
        int quantidadeNumeros = input.nextInt();
        if (quantidadeNumeros <= 0) {
            System.out.println("Número inválido para quantidade, escolha outro.");
        } else {
            int soma = 0;
            for (int i = 1; i <= quantidadeNumeros; i++) {
                System.out.println("Digite o " + i + "º número:");
                int numero = input.nextInt();
                if (numero <= 0) {
                    System.out.println("Número incorreto para realizar a média.");
                    break;
                } else {
                    soma += numero;
                }
                double media = (double) soma / (double) quantidadeNumeros;
                System.out.println("A média dos números informados é: " + media);
            }
            input.close();
        }
    }
}
