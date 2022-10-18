package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
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
			
		case"1":
			exibirSubMenuAdicionarMoedas();
			exibirMenuPrincipal();
			
			break;
		case"3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			
			break;
		default:
			System.out.println("Opção Inválida");
			exibirMenuPrincipal();
			break;
			
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.println("Valor total convertido para real? "+valorTotalConvertido);
			break;
		}
	}
	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Escolha a moeda");
		System.out.println("1-Real");
		System.out.println("2-Dolar");
		System.out.println("3-Euro: ");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorTextualMoeda = sc.next();
		valorTextualMoeda = valorTextualMoeda.replace(",", ".");
		
		double valorMoeda = Double.valueOf(valorTextualMoeda);
		
		Moeda moeda=null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real (valorMoeda);
			cofrinho.adicionar(moeda);
		} else if(opcaoMoeda == 2) {
			moeda = new Dolar (valorMoeda);
			cofrinho.adicionar(moeda);
		} else if(opcaoMoeda == 3 ) {
			moeda = new Euro (valorMoeda);
			cofrinho.adicionar(moeda);
		}else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		

	
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada!");
	}
}
