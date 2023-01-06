package Fil_Rouge;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "produit")

 class DO_Sandwich implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id", unique = true)
	private long id;
	
	@Column ( name = "nosandwich", nullable = false)
	private int nosandwich;
	
	@Column ( name = "produits", nullable = false)
	private String produits;
	
	@Column (name = "prix", nullable = false)
	private float prix;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nosandwich
	 */
	public int getNosandwich() {
		return nosandwich;
	}

	/**
	 * @param nosandwich the nosandwich to set
	 */
	public void setNosandwich(int nosandwich) {
		this.nosandwich = nosandwich;
	}

	/**
	 * @return the produits
	 */
	public String getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(String produits) {
		this.produits = produits;
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
	
	

}
