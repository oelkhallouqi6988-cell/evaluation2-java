package eva2java;

public class Commande {
	String numero ;
	String destination ;
	public Commande(String numero, String destination) {
		super();
		this.numero = numero;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Commande [numero=" + numero + ", destination=" + destination + "]";
	} 
	
	
}

