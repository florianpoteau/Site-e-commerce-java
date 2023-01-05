package Fil_Rouge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	
	@Service
	public class ProduitServiceimpl implements Convert_Sandwich {
		
		 @Autowired 
		  private DAO_Stock produitDAO;
		
		 @Override
		 public DTO_Sandwich ConvertProduitDTO(DO_Sandwich produit) {
			    DTO_Sandwich produitDTO = new DTO_Sandwich();
			    produitDTO.setId(produit.getId());
			    produitDTO.setNosandwich(produit.getNosandwich());;
			    produitDTO.setProduits(produit.getProduits());
			    produitDTO.setPrix(produit.getPrix());
			    return produitDTO;
			  }

		 @Override
		 public DO_Sandwich ConvertProduits(DTO_Sandwich produitDTO) {
			    DO_Sandwich produit = new DO_Sandwich();
			    produitDTO.setId(produit.getId());
			    produitDTO.setNosandwich(produit.getNosandwich());;
			    produitDTO.setProduits(produit.getProduits());
			    produitDTO.setPrix(produit.getPrix());
			    return produit;
			  }
		 
		 
		 @Override
		 public void createProduit(DTO_Sandwich produitDTO) {
		  DO_Sandwich produit = ConvertProduits(produitDTO);
		  produitDAO.save(produit);
			  }
		 
		 @Override

		 public List<DTO_Sandwich> findAll() {
			    List<DO_Sandwich> products = produitDAO.findAll();
			    return products.stream().map(this::ConvertProduitDTO).collect(Collectors.toList());
			  }
		 
		 public DO_Sandwich getById(long id) {
			return produitDAO.findById(id).orElse(null);
			
			  }
		 
		 @Override
		 public void deleteById (long id) {
			  produitDAO.deleteById(id);
			}
		 
		 @Override
		 public List<DO_Sandwich> getByNosandwich (int nosandwich) {
			 return produitDAO.findOneByNosandwich(nosandwich);
		 }
		 
		 @Override
		 public List<DO_Sandwich> getByPrix (int prix) {
			 return produitDAO.findPrixSandwich(prix);
		 }

		

		
		 
		 
		 

}
	
