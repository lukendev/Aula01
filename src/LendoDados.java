import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// As duas linhas abaixo exibem mensagens na tela
		System.out.println("PROGRAMA EDUCADO!");
		System.out.println("Por favor, digite o seu nome: ");
		// Para ler dados, a linha abaixo CRIA um scanner
		Scanner leitor = new Scanner(System.in);
		// Para guardar dados de texto, a linha abaixo cria uma vari�vel
		String nome;
		// Para ler dados e guardar na vari�vel, usamos o scanner criado
		nome = leitor.next();
		// A linha abaixo exibe a mensagem com o conte�do da vari�vel
		System.out.println("Boa noite, " + nome);
		leitor.close();
	}

}
