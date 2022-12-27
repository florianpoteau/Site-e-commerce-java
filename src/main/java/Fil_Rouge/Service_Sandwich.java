package Fil_Rouge;

import java.util.List;

public interface Service_Sandwich {
	
	DTO_Sandwich ConvertDto_Sandwich(DO_Sandwich produit);
	DO_Sandwich ConvertProduit (DTO_Sandwich produitDTO);
	
	List<DTO_Sandwich> findAll();
	void createProduit(DTO_Sandwich sandwichDTO);
	DO_Sandwich getById (int id);

}
