package uninter;

public class Real extends Moeda {
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}
	
	public Real() {
		
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void info() {
		System.out.println("Real - "+valor);
	}

	public double converter() {
		return this.valor;
		
	}
	
	
		
}


