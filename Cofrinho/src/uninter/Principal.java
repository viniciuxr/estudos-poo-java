package uninter;

public class Principal {

	public static void main(String[] args) {
		//Menu menu = new Menu();
		//menu.exibirMenuPrincipal();
		Moeda moedaDeUmReal = new Real(1);
		moedaDeUmReal.info();
		System.out.println(moedaDeUmReal.converter());
		
		System.out.println("------------------------");
		
		Moeda moedaDeDolar = new Dolar(5);
		moedaDeDolar.info();
		System.out.println(moedaDeDolar.converter());
	}

}
