package entidades.uninter.excecao;

public class MoedasExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String msg;
	public MoedasExcecao(String msg) {
		this.msg = msg;
	}
	
}
