package exerciciosEstruturaRepeticao.exercicio9;

import java.util.Scanner;

public class CalculadoraValorFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número para se calcular o fatorial:");
        int respostaUsuario = input.nextInt();
        if (respostaUsuario <= 0) {
            System.out.println("Número inválido, escolha outro.");
        } else if (respostaUsuario == 1) {
            System.out.println("O valor fatorial de 1 é ele mesmo.");
        } else {
            int contador = respostaUsuario;
            int valorFatorial = 0;
            while (contador >= 1) {
                valorFatorial += contador;
                contador--;
            }
            System.out.println("O valor fatorial de " + respostaUsuario + " é: " + valorFatorial);
        }
    }
}