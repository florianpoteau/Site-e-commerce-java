package Fil_Rouge;

public class SandwichDto {
	
	private int id;
	private int noproduit;
	private String nom;
	private String produit1;
	private String produit2;
	private String produit3;
	private String produit4;
	private String produit5;
	private float prix;
	private int quantité;
	
	public SandwichDto (int id, int noproduit, String nom, String produit1, String produit2, String produit3, String produit4, String produit5, float prix, int quantité) {
		this.id = id;
		this.noproduit = noproduit;
		this.nom = nom;
		this.produit1 = produit1;
		this.produit2 = produit2;
		this.produit3 = produit3;
		this.produit4 = produit4;
		this.produit5 = produit5;
		this.prix = prix;
		this.quantité = quantité;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the noproduit
	 */
	public int getNoproduit() {
		return noproduit;
	}
	/**
	 * @param noproduit the noproduit to set
	 */
	public void setNoproduit(int noproduit) {
		this.noproduit = noproduit;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the produit1
	 */
	public String getProduit1() {
		return produit1;
	}
	/**
	 * @param produit1 the produit1 to set
	 */
	public void setProduit1(String produit1) {
		this.produit1 = produit1;
	}
	/**
	 * @return the produit2
	 */
	public String getProduit2() {
		return produit2;
	}
	/**
	 * @param produit2 the produit2 to set
	 */
	public void setProduit2(String produit2) {
		this.produit2 = produit2;
	}
	/**
	 * @return the produit3
	 */
	public String getProduit3() {
		return produit3;
	}
	/**
	 * @param produit3 the produit3 to set
	 */
	public void setProduit3(String produit3) {
		this.produit3 = produit3;
	}
	/**
	 * @return the produit4
	 */
	public String getProduit4() {
		return produit4;
	}
	/**
	 * @param produit4 the produit4 to set
	 */
	public void setProduit4(String produit4) {
		this.produit4 = produit4;
	}
	/**
	 * @return the produit5
	 */
	public String getProduit5() {
		return produit5;
	}
	/**
	 * @param produit5 the produit5 to set
	 */
	public void setProduit5(String produit5) {
		this.produit5 = produit5;
	}
	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}
	/**
	 * @return the quantité
	 */
	public int getQuantité() {
		return quantité;
	}
	/**
	 * @param quantité the quantité to set
	 */
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

}
