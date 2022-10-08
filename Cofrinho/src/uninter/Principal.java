package uninter;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//Menu menu = new Menu();
		//menu.exibirMenuPrincipal();
		Real moedaDeUmReal = new Real(1);
		moedaDeUmReal.info();
		System.out.println(moedaDeUmReal.converter());
		
		Real outraMoedaDeReal = new Real(5);
		moedaDeUmReal.info();
		System.out.println(moedaDeUmReal.converter());
		
		
		
		System.out.println("------------------------");
		
		Dolar moedaDeDolar = new Dolar(5);
		moedaDeDolar.info();
		System.out.println(moedaDeDolar.converter());
		
		System.out.println("------------------------");
		
		ArrayList<Moeda> listaDeMoedas = new ArrayList<>();
		System.out.println("Lista de moedas: "+listaDeMoedas.toString());
		
		listaDeMoedas.add(moedaDeUmReal);
		listaDeMoedas.add(outraMoedaDeReal);
		listaDeMoedas.add(moedaDeDolar);
		
		for(Moeda moedaDeReal: listaDeMoedas) {
			moedaDeReal.info();
		}
	}


}
