package uninter;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//Menu menu = new Menu();
		//menu.exibirMenuPrincipal();
		
		Cofrinho cofrinho = new Cofrinho();
		cofrinho.listagemMoedas();
		
		Real doisReais = new Real(2);
		Dolar cincoDolar = new Dolar(5);
		Euro vinteECincoEuros = new Euro(25);
		Real tresReais = new Real(3);
		
		cofrinho.adicionar(doisReais);
		cofrinho.adicionar(cincoDolar);
		cofrinho.adicionar(vinteECincoEuros);
		cofrinho.adicionar(tresReais);
		
		cofrinho.listagemMoedas();
		}
}


