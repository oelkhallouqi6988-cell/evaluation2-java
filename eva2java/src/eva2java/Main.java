package eva2java;

import evajava.Ingenieur;

public class Main {
	public static void main(String[] args) {

	     
		 livreur moto1 = new  livreur(
            "l11", "livre1", 5.4
        );
		 livreur moto2  = new  livreur(
		            "l21", "livre2", 5.3
		        );
		 
		 livreur camion1  = new  livreur(
		            "l41", "livre3", 5.8
		        );
		 
		 livreur camion2  = new  livreur(
		            "l51", "livre4", 5.7
		        );
		 Livreur[] Livreur = {moto1,moto2,camion1,camion2};
		 double total = 0;
		 for (int i = 0; i < Livreur.length; i++) {
	             Livreur. calculerFrais();
	             Livreur.afficherDetails();
	            
	        }
		 for (int i = 0; i < Livraison.length; i++) {
			 Livraison. calculerFrais();
			 Livraison.afficherRecapitulatif();
			 total += Livraison [i].calculerMontant();
        }
}
