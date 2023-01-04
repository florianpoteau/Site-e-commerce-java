package Fil_Rouge;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	
	
	
	
    
	
	

}
