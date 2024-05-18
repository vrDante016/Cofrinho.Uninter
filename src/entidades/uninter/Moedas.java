package entidades.uninter;

public abstract class Moedas {

	private double valor;

	public Moedas() {
		
	}
	public Moedas(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public  abstract String info();
	public abstract double converter(Moedas moedas);
	
}
