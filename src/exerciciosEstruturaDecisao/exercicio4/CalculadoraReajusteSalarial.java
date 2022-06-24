package exerciciosEstruturaDecisao.exercicio4;

import java.util.Scanner;
public class CalculadoraReajusteSalarial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe qual o seu salário:");
        double salarioAntigo = input.nextDouble();
        input.close();
double reajuste;
if (salarioAntigo < 280) {
    reajuste = salarioAntigo * 0.2;
}
else if (salarioAntigo >= 280 && salarioAntigo < 700) {
    reajuste = salarioAntigo * 0.15;
}
else if (salarioAntigo >= 700 && salarioAntigo < 1500) {
    reajuste = salarioAntigo * 0.1;
}
else {
    reajuste = salarioAntigo * 0.05;
}
double salarioNovo = salarioAntigo + reajuste;
        System.out.printf("Salário antigo: R$%.2f", salarioAntigo);
        System.out.printf("\nValor adicional de reajuste: R$%.2f", reajuste);
        System.out.printf("\nNovo salário: R$%.2f", salarioNovo);
    }
}
