package exerciciosEstruturaRepeticao.exercicio8;

public class CalculadoraSomaFixaNumerosImpares {
    public static void main(String[] args) {
        int contador = 1;
int soma = 0;
while (contador < 100) {
    if (contador % 2 > 0) {
        soma += contador;
    }
    contador ++;
        }
        System.out.println("A soma dos 50 primeiros números ímpares é: "+soma);
}
}
