package Fil_Rouge;

import java.util.List;

import Fil_Rouge.DAO_Stock;
import Fil_Rouge.DO_Sandwich;
import javax.servlet.http.HttpSession;

public interface Convert_Sandwich {

		DTO_Sandwich ConvertProduitDTO(DO_Sandwich produit);
		 public DO_Sandwich ConvertProduits(DTO_Sandwich produitDTO);
		void createProduit(DTO_Sandwich produitDTO);
		public List<DTO_Sandwich> findAll();
	}
	
	
