package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10; //escrever int antes, já que queremos números inteiros
		idade = idade+2; //idade recebe ela mesmo +2
		double peso = 75.8; //double, acessa com precisão, porém ocupa mais espaço
		String nome = "Vinicius";
		
		System.out.println("Digite nome, idade e peso");
		Scanner input = new Scanner (System.in);
		nome=input.next();
		idade=input.nextInt(); // numeros inteiros
		peso=input.nextDouble(); // numeros double
		
		System.out.println("O nome é: "+nome);
		System.out.println("a idade é: "+idade); // + concatena
		System.out.println("O peso é: "+peso);
		
		if (idade <18) {
			System.out.println("Acesso negado, você é muito novo");
		}
		else if (idade <65) {	
			System.out.println("Acesso, concedido, você é um adulto");
		}	
		
		else {
			System.out.println("Acesso concedido, tá velhinho hein");
		}
		
		for(int i=0; i<10; i++) { //++ significa +=1
			System.out.println("Valor: "+i);
		}
		//array
		//lista
		int megaSena[] = {11,14,21,30,36,34,56};
		int numeros[] = new int[200];
		numeros[60] = 50;
		megaSena[0] = 10; //modificando valor
	}

}
