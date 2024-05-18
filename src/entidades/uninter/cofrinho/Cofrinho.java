package entidades.uninter.cofrinho;

import java.util.ArrayList;
import java.util.List;

import entidades.uninter.Euro;
import entidades.uninter.Moedas;
import entidades.uninter.RubloRusso;
import entidades.uninter.Yen;
import entidades.uninter.excecao.MoedasExcecao;

public class Cofrinho {

	private Euro euro;
	private Yen yen;
	private RubloRusso rubloRusso;
	
	List<Moedas> moedas = new ArrayList();
	
	public Cofrinho() {
		
	}

	public Cofrinho(Euro euro, Yen yen, RubloRusso rubloRusso) {
		this.euro = euro;
		this.yen = yen;
		this.rubloRusso = rubloRusso;
	}

	public Euro getEuro() {
		return euro;
	}

	public void setEuro(Euro euro) {
		this.euro = euro;
	}

	public Yen getYen() {
		return yen;
	}

	public void setYen(Yen yen) {
		this.yen = yen;
	}

	public RubloRusso getRubloRusso() {
		return rubloRusso;
	}

	public void setRubloRusso(RubloRusso rubloRusso) {
		this.rubloRusso = rubloRusso;
	}

	public List<Moedas> getMoedas() {
		return moedas;
	}
	public void addMoedas(Moedas todasMoedas) {
		moedas.add(todasMoedas);
	}
	public void removerMoedas(Moedas todasMoedas) {
		if(moedas.isEmpty()) {
			throw new MoedasExcecao("Não encontramos nenhuma moeda!");
		}
		moedas.remove(todasMoedas);
	}
	public String ListagemMoedas() {
		if(moedas.isEmpty()) {
			throw new MoedasExcecao("O cofrinho esta vazio!");
		}
		StringBuilder sb = new StringBuilder();
		for(Moedas m : moedas) {
			sb.append(m.info()).append("  ");
		}
		return sb.toString();
	}
	public double valorTotal() {
		double valor = 0;
		for(Moedas m : moedas) {
			valor += m.getValor();
		}
		return valor;
	}
	
}
