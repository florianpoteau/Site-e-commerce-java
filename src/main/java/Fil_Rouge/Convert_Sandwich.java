package Fil_Rouge;

import java.util.List;

import Fil_Rouge.DO_Sandwich;

import javax.servlet.http.HttpSession;

public interface Convert_Sandwich {

		DTO_Sandwich ConvertProduitDTO(DO_Sandwich produit);
		 public DO_Sandwich ConvertProduits(DTO_Sandwich produitDTO);
		void createProduit(DTO_Sandwich produitDTO);
		List<DTO_Sandwich> findAll();
		DO_Sandwich getById(long id);
		public void deleteById (long id);
		List<DO_Sandwich> getByNosandwich (int nosandwich);
		List<DO_Sandwich> getByPrix (int prix);
	}
	
	
