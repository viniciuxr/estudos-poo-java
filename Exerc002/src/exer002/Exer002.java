package exer002;

import java.util.Scanner;

public class Exer002 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int palpite;
		int valorCorreto=10000;
		System.out.println("Digite seu palpite: ");
		palpite = input.nextInt();
		String msg;
		
		/*int idade = 10;
		if(idade>5 && idade<15); and
		if(idade>5 || idade<15); or
		if(!(idade>5)); not*/
		
		while(palpite != valorCorreto) {
			msg = palpite>valorCorreto?"Um pouco menos...":"Um pouco mais"; //operado ternários pode substituir os ifs se a estrutura for essa
			System.out.println(msg);
			/*if(palpite>valorCorreto) {
				System.out.println("Um pouco menos...");
			
			}
			else {
				System.out.println("Um pouco mais...");
			}*/
			System.out.println("Digite outro palpite: ");
			palpite = input.nextInt();
		
		}
		System.out.println("Parabéns, você acertou!");
	}

}
