package entidades.uninter;

import java.text.DecimalFormat;

import entidades.uninter.excecao.MoedasExcecao;

public class Euro extends Moedas {

	public Euro() {
		
	}
	public Euro(double valor) {
		super(valor);
		
	}

	@Override
	public String info() {
		DecimalFormat df = new DecimalFormat();
		return ("Euro €" + df.format(getValor()));
	}

	@Override
	public double converter(Moedas moedas) {
		if(moedas.getValor() <= 6) {
			throw new MoedasExcecao("Valor para conversão é muito baixo ou insuficiente");
		}
		return moedas.getValor() * 0.05;	
	}

}
