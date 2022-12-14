package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in); //comando de entrada de dados
		cofrinho = new Cofrinho(); 
	}

	public void exibirMenuPrincipal() { // menu principal
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar moeda: ");
		System.out.println("2-Remover moeda: ");
		System.out.println("3-Listar moedas: ");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");

		String opcaoSelecionada = sc.next();
		
		switch (opcaoSelecionada) { //switch case para condicições
		
			case"0":
				System.out.println("Operação finalizada");
				break;
				
			case"1":
				exibirSubMenuAdicionarMoedas();
				exibirMenuPrincipal();
				
			case"2":
				exibirSubMenuRemoverMoedas();
				exibirMenuPrincipal();
				break;
			case"3":
				cofrinho.listagemMoedas();
				exibirMenuPrincipal();
				
				break;
				
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido);
				valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".", ",");
				System.out.println("Valor total convertido para real? "+valorTotalConvertidoTextual);
				exibirMenuPrincipal();
				break;
				
			default:
				System.out.println("Opção Inválida");
				exibirMenuPrincipal();
				break;
		}
	}
	 private void exibirSubMenuAdicionarMoedas() {  //submenu referente ao requisito de adicionar moeda do cofre
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
		} else if(opcaoMoeda == 2) {
			moeda = new Dolar (valorMoeda);
		} else if(opcaoMoeda == 3 ) {
			moeda = new Euro (valorMoeda);
		}else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		

	
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada!");
		
		
		
	}
	 private void exibirSubMenuRemoverMoedas() { //submenu referente ao requisito de remover moeda do cofre
			System.out.println("Escolha a moeda");
			System.out.println("1-Real");
			System.out.println("2-Dolar");
			System.out.println("3-Euro: ");
			
			int opcaoMoeda = sc.nextInt();
			
			System.out.println("Digite o valor: ");
			
			String valorTextoMoeda = sc.next();
			
			
			valorTextoMoeda = valorTextoMoeda.replace(",", "."); //subtituição de caracteres/replace
			double valorMoeda = Double.valueOf(valorTextoMoeda);
			
			
			Moeda moeda=null;
			
			if (opcaoMoeda == 1) {
				moeda = new Real (valorMoeda);
			} else if(opcaoMoeda == 2) {
				moeda = new Dolar (valorMoeda);
			} else if(opcaoMoeda == 3 ) {
				moeda = new Euro (valorMoeda);
			}else {
				System.out.println("Não existe essa moeda!");
				exibirMenuPrincipal();
			}
			
			boolean removeuMoeda = cofrinho.remover(moeda); 
		
			if (removeuMoeda){
				System.out.println("Moeda removida!");
			} else {
				System.out.println("Não foi encontrada nenhuma moeda com o valor indicado!");
			}
			
			
			
			
			
		}
}
