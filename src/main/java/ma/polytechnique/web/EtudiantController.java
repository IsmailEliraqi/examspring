package ma.polytechnique.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.polytechnique.*;
import ma.polytechnique.metier.ServiceEtudiant;
@Controller
public class EtudiantController {
	
	@Autowired
	ServiceEtudiant serviceetudiant;
	@Secured(value={"ROLE_ADMIN"})
	@RequestMapping(value="/etudiants")
	public String all_etudiants(Model model) {
		model.addAttribute("etudiants", serviceetudiant.allEtudiants());
		return "allEtudiants";
	}
	
	@Secured(value={"ROLE_VISITEUR","ROLE_ADMIN"})
	@RequestMapping(value="/etudiantbyadmis")
	public String display(Model model) {
		model.addAttribute("etudiants",serviceetudiant.findByAdmis("1"));
		return "etudiantbyadmis";
	}
	

}
