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
		List<DTO_Sandwich> produits = interface_sandwich.findAll();
        model.addAttribute("produits", produits);
        
        return "index";
        
      }
	
	

}
