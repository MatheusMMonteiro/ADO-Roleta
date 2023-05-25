package roleta;

public class Premio {
	private String nome;
	private Premio anterior;
	private Premio proximo;
	
public Premio() {
		
	}
public Premio(String premio) {
	this.nome = premio;
}
	
	public void adicionar(String premio) {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Premio getAnterior() {
		return anterior;
	}
	public void setAnterior(Premio anterior) {
		this.anterior = anterior;
	}
	public Premio getProximo() {
		return proximo;
	}
	public void setProximo(Premio proximo) {
		this.proximo = proximo;
	}
	
	
}
