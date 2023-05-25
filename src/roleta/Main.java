package roleta;

public class Main {

	public static void main(String[] args) {
		
		RoletaPremio roleta = new RoletaPremio();
		
		roleta.adicionar("Bola");

		roleta.adicionar("Tênis");

		roleta.adicionar("PS4");

		roleta.adicionar("PC");

		roleta.adicionar("Monitor");
		//roleta.remover("PS4");
		roleta.verPremios();
		System.out.println("Total de Prêmios: "+ roleta.totalPremios());
	}

}
