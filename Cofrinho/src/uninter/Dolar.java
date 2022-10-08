package uninter;

public class Dolar extends Moeda {

	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	
	public void info() {
		System.out.println("Dolar - "+valor);

		
	}


	public double converter() {
		return this.valor*5.21;
	}

}
