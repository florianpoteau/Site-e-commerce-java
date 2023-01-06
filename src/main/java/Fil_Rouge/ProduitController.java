package Fil_Rouge;

import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProduitController {
	
	@Autowired
	private Convert_Sandwich interface_sandwich;
	
	@Autowired
	  private HttpServletRequest request;
	
	
	
	@GetMapping("/")
    public String list(Model model) {
		DO_Sandwich produits = interface_sandwich.getById(1);
        model.addAttribute("produit1", produits);
        DO_Sandwich produits2 = interface_sandwich.getById(2);
        model.addAttribute("produit2", produits2);
        DO_Sandwich produits3 = interface_sandwich.getById(3);
        model.addAttribute("produit3", produits3);
        DO_Sandwich produits4 = interface_sandwich.getById(4);
        model.addAttribute("produit4", produits4);
        DO_Sandwich produits5 = interface_sandwich.getById(5);
        model.addAttribute("produit5", produits5);
        DO_Sandwich produits6 = interface_sandwich.getById(6);
        model.addAttribute("produit6", produits6);
        DO_Sandwich produits7 = interface_sandwich.getById(7);
        model.addAttribute("produit7", produits7);
        DO_Sandwich produits8 = interface_sandwich.getById(8);
        model.addAttribute("produit8", produits8);
        return "index";
        }
      
	
	@PostMapping("/delete")
	public String delete(@RequestParam("id")long id , Model model) {
	    interface_sandwich.deleteById(id);
	    model.addAttribute("message", "L'élément a été supprimé avec succès.");
	    return "redirect:/";
	}
	
	@PostMapping ("/post")
	public String deletebynom(@RequestParam("nosandwich")int nosandwich, Model model) {
		List<DO_Sandwich> sandwich = interface_sandwich.getByNosandwich(nosandwich);
		if (sandwich == null) {
			model.addAttribute("errorMessage", "Le produit n'est plus disponible dans le panier.");
			return "error-page";
		}
		interface_sandwich.getByNosandwich(nosandwich);
		model.addAttribute("message", "Le produit à été commandé");
		return "confirmation-page";
	}
	
	@GetMapping ("/prix")
	public String getPrix(@RequestParam("prix")int prix, Model model) {
		List<DO_Sandwich> prixProduit = interface_sandwich.getByPrix(prix);
		model.addAttribute("prixproduit", prixProduit);
		return "index";
		
	}	

}
