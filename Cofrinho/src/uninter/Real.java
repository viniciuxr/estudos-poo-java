package uninter;

public class Real extends Moeda {
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}
	
	
	@Override
	public void info() {
		System.out.println("Real - "+valor);
	}
	
	@Override
	public double converter() {
		return this.valor;
		
	}
	
	@Override
	public boolean equals(Object objeto) {
		return false;
	}
	
	
	
	
		
}


