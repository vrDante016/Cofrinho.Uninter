package entidades.uninter;

import java.text.DecimalFormat;

import entidades.uninter.excecao.MoedasExcecao;

public class Yen extends Moedas {

	public Yen() {
		
	}
	public Yen(double valor) {
		super(valor);
		
	}

	@Override
	public String info() {
		DecimalFormat df = new DecimalFormat();
		return ("Yen ¥" + df.format(getValor()));
	}

	@Override
	public double converter(Moedas moedas) {
		if(moedas.getValor() <= 0) {
			throw new MoedasExcecao("Valor para conversão é muito baixo ou insuficiente");
		}
		return moedas.getValor() * 0.03;
	
	}

	
}
