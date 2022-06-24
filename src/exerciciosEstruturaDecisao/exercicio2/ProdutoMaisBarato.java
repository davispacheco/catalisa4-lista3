package exerciciosEstruturaDecisao.exercicio2;

import java.util.Scanner;
public class ProdutoMaisBarato {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double[] precosProdutos = new double[3];
for (int i = 0; i < 3; i ++) {
    System.out.println("Informe o preço do " + (i+1) + "º produto:");
    precosProdutos[i] = input.nextDouble();
}
double resultado;
if(precosProdutos[0] < precosProdutos[1] && precosProdutos[0] < precosProdutos[2]) {
resultado = precosProdutos[0];
}
else if(precosProdutos[1] < precosProdutos[0] && precosProdutos[1] < precosProdutos[2]) {
    resultado = precosProdutos[1];
}
else {
    resultado = precosProdutos[2];
}
        System.out.printf("O produto que você deverá comprar é o que custa R$%.2f", resultado);
System.out.printf(", pois está mais barato.");

    }
}
