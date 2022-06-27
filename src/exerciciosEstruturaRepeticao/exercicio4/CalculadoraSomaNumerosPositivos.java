package exerciciosEstruturaRepeticao.exercicio4;

import java.util.Scanner;

public class CalculadoraSomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos números deseja somar:");
        int quantidadeNumeros = input.nextInt();
        int soma = 0;
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.println("Digite o " + i + "º número:");
            int numero = input.nextInt();
            if (numero <= 0) {
                System.out.println("Número inválido, escolha outro.");
                break;
            } else {
                soma += numero;
            }
        }
        input.close();
        System.out.println("A soma dos números informados é: " + soma);
    }
}
