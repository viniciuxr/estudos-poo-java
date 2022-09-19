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
		
	}

}
