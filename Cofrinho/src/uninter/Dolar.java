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
	
	@Override
	public boolean equals(Object objeto) {
		
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDol = (Dolar) objeto;
		
		if(this.valor != objetoDeDol.valor) {
			return false;
		}
		
		return true;
	}

}
