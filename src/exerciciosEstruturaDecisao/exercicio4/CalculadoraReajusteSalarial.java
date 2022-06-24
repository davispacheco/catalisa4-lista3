package exerciciosEstruturaDecisao.exercicio4;

import java.util.Scanner;

public class CalculadoraReajusteSalarial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe qual o seu salário:");
        double salarioAntigo = input.nextDouble();
        input.close();
        double percentual;
        if (salarioAntigo < 280) {
            percentual = 0.2;
        } else if (salarioAntigo >= 280 && salarioAntigo < 700) {
            percentual = 0.15;
        } else if (salarioAntigo >= 700 && salarioAntigo < 1500) {
            percentual = 0.1;
        } else {
            percentual = 0.05;
        }
        double reajuste = salarioAntigo * percentual;
        double salarioNovo = salarioAntigo + reajuste;
        System.out.printf("Salário antigo: R$%.2f", salarioAntigo);
        System.out.println("\nPercentual aplicado: " + (percentual * 100) + "%");
        System.out.printf("Valor adicional de reajuste: R$%.2f", reajuste);
        System.out.printf("\nNovo salário: R$%.2f", salarioNovo);
    }
}
