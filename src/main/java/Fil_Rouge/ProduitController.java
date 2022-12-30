package Fil_Rouge;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProduitController {
	
	@Autowired
	
	private Convert_Sandwich interface_sandwich;
	
	@Autowired
	  private HttpServletRequest request;
	
	@GetMapping("/")
    public String list(Model model) {
		List<DTO_Sandwich> produits = ProduitServiceimpl.findAll();
        model.addAttribute("produits", produits);
        HttpSession session = request.getSession();
	      Panier panier = (Panier) session.getAttribute("panier");
	      if (panier == null) {
	        panier = new Panier();
	        session.setAttribute("panier", panier);
	      }
	      model.addAttribute("panier", panier);
	      // Récupère le panier de la session et envoie son nombre d'éléments à la vue
	      if (panier != null) {
	        model.addAttribute("panierIcone", panier.getProduits().size());
	      } else {
	        model.addAttribute("panierIcone", 0);
	      }
	      model.addAttribute("prixTotal", panier.prixTotal());
	
        return "index";
      }
	
	

}
