package Fil_Rouge;

//test

public class SandwichDaoImpl implements InterfaceDAO {

	@Override
	public void ajouterproduit(int id, int noproduit, String nom, String produit1, String produit2, String produit3,
			String produit4, String produit5, float prix) {
		// TODO Auto-generated method stub
		SandwichDto sandwichdto = new SandwichDto(id, noproduit, nom, produit1, produit2, produit3, produit4, produit5, prix, 0);
		
		
	}

	@Override
	public void deletesandwich(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getsandwich(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getsandwichs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dateAchat(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
