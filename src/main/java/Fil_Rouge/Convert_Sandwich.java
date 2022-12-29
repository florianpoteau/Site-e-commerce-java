package Fil_Rouge;

import java.util.List;

import Fil_Rouge.DAO_Stock;
import Fil_Rouge.DO_Sandwich;

public interface Convert_Sandwich {

		DTO_Sandwich ConvertProduitDTO(DO_Sandwich produit);
		DO_Sandwich ConvertProduit(DTO_Sandwich produitDTO);
		
		List<DTO_Sandwich> findAll();
		void createProduit(DTO_Sandwich produitDTO);
		DO_Sandwich getById(long id);
	}
	
	
