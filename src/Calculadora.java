import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa calculadora");
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		int multiplicacao;
		double divisao;
		
		System.out.println("Por favor, digite o primeiro valor");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, digite o segundo valor");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = (double) valor1 / (double) valor2;
		
		System.out.println("A soma dos valores é " + soma);
		System.out.println("A subtração dos valores é " + subtracao);
		System.out.println("A multiplicação dos valores é " + multiplicacao);
		System.out.println("A divisão dos valores é " + divisao);
		
		leitor.close();
	}

}
