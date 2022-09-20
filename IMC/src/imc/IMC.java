package imc;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		int peso;
		double altura;
		
		System.out.println("Digite abaixo seu peso e sua altura, respectivamente: ");
		Scanner input = new Scanner(System.in);
		peso = input.nextInt();
		altura = input.nextDouble();
		double imc = peso/(altura*altura);
		System.out.printf("O seu IMC é: %.2f",imc); //print f e %.2f para cortar as casas decimais, poderia colocar %d para n° inteiros ou %s para strings
		

	}

}
