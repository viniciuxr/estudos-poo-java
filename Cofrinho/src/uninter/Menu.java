package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}

	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar moeda: ");
		System.out.println("2-Remover moeda: ");
		System.out.println("3-Listar moedas: ");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");

		String opcaoSelecionada = sc.next();
		
		switch (opcaoSelecionada) {
		case"0":
			System.out.println("Operação finalizada");
			break;
		default:
			System.out.println("Opção Inválida");
			exibirMenuPrincipal();
			break;
		}
	}

}
