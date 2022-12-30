package Fil_Rouge;

import java.util.List;

public interface InterfaceDAO {

	public void ajouterproduit (final int id, final int noproduit, final String nom, final String produit1, final String produit2, final String produit3, final String produit4, final String produit5, final float prix);
	public void deletesandwich ( final int id);
	public void getsandwich(final int id);
	public List<DO_Sandwich> getsandwichs ();
	public void dateAchat (final int id);
	
}
