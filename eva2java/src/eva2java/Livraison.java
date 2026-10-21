package eva2java;

public class Livraison extends Livreur {
	double distance ;
	private Livreur Livreur ;
	private Commande Commande ;
	public Livraison(double distance, eva2java.Livreur livreur, eva2java.Commande commande) {
		super();
		this.distance = distance;
		Livreur = livreur;
		Commande = commande;
	}
	
	private double calculerMontant() ;
	private void afficherRecapitulatif();
	
	
}
