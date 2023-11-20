package curso_programacao;

import java.util.Scanner;

public class LeituraDadosTEclado {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite seu nome completo, Cpf, endereço e cidade: ");
		
			String Nome = scan.nextLine();
			String Cpf = scan.nextLine();
			String Endereco = scan.nextLine();
			String Cidade = scan.nextLine();
			printT obj = new printT();
			obj.console("Nome completo: " + Nome);
			
			System.out.println("Nome completo: " + Nome);
			System.out.println("Cpf: " + Cpf);
			System.out.println("Endereco: " + Endereco);
			System.out.println("Cidade: " + Cidade);
			
			}
		}
	}
		


