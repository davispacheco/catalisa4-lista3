package exerciciosEstruturaDecisao.exercicio5;

import java.util.Scanner;

public class ConversorNumeroDiaSemana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua opção:");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda-feira");
                break;
            case 3:
                System.out.println("Dia da semana: Terça-feira");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta-feira");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta-feira");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta-feira");
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
        }
    }
}
