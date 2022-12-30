package Fil_Rouge;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private List<DO_Sandwich> produits;
	
	public Panier() {
		produits = new ArrayList <>();
	}
	
	public void ajouterProduit(DO_Sandwich produit) {
	    produits.add(produit);
	  }
	
	 public List<DO_Sandwich> getProduits() {
		    return produits;
		  }
	 
	 public float prixTotal() {
		  float total = 0;
		  for (DO_Sandwich produit : produits) {
		    total += produit.getPrix();
		  }
		  return total;
		}

}
