package roleta;

import java.util.Iterator;

public class RoletaPremio {
	private Premio inicio;
	private Premio fim;
	
	public void adicionar(String premio) {
		if(inicio == null) {
			inicio = new Premio(premio);
			inicio.setProximo(inicio);
			inicio.setAnterior(inicio);
			fim = inicio;
		}else {
			Premio p = new Premio(premio);
			fim.setProximo(p);
			p.setAnterior(p);
			p.setProximo(inicio);
			fim = p;
		}
	}
	
	public void verPremios() {
		Premio p = inicio;
		
		while(p != null) {
			System.out.println(p.getNome());
			p = p.getProximo();
			
			if(p == inicio) {
				break;
				
			}
		}
	}
	
	public void remover(String premio) {
		if(inicio == null) return;
		
		Premio p = inicio;
		do {
			if(p.getNome().equals(premio)) {
				p.getAnterior().setProximo(p.getProximo());				
				p.getProximo().setAnterior(p.getAnterior());
				
			}
			p = p.getProximo();	
		}while(p!=inicio);
	}
	
	public void alterar(String antigo, String novo) {
		Premio p = inicio;
		
		
		
	}
	
	public int totalPremios() {
		Premio p = inicio;
		int total =0;
		while(p !=null) {
			total++;
			p = p.getProximo();
			if(p== inicio) {
				break;
			}
		}
		return total;
		
		
	}
	
}
