package eva2java;

public class Livreur {
	String identifiant ;
	String nom ;
	double tarifKm ;
	public Livreur(String identifiant, String nom, double tarifKm) {
		
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}
	 public String  getIdentifiant() {
		 return identifiant ;
	 } ;
	
	 public String  getNom() {
		 return nom ;
		 
	 }
	public abstract  double calculerFrais(double distance) ;
		
	public void afficherDetails() {
		System.out.println("identifiant:" +identifiant );
		System.out.println("inom:" +nom);
		System.out.println(" tarifKm:" + tarifKm);
	}
	
	public void setResponsable(Livreur responsable) ;
	public Livreur getResponsable() {
		return responsable ;
	};
	public Livreur setResponsable() {
		return responsable ;
	};
	
	}
