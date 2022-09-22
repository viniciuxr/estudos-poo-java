package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		//ArrayList<Integer> megaSena = new ArrayList <Integer>(); int não é permitido, então usamos integer (classe)
		Scanner input  = new Scanner (System.in);
		
		ArrayList<String> listaNomes = new ArrayList <String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = input.nextInt();
		String nome;
		for (int i=0;i<qtd;i++) {
			nome = input.next();
			listaNomes.add(nome);
		/*variáveis primitivas
		 int 
		 float
		 double
		 char  letra = 'd';*/
		/*classes
		 String*/
		}	
		
		/*for(int i=listaNomes.size()-1; i>=0; i--) {
			System.out.println(listaNomes.get(i));
		}*/
		
		System.out.println("Ordem normal: ");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		
		System.out.println("Ordem reversa: ");
		System.out.println(listaNomes);
		
		
	}
}