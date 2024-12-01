package edu.iset.atelierSpringBoot.atelier1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iset.atelierSpringBoot.atelier1.entities.LoginRequest;
import edu.iset.atelierSpringBoot.atelier1.entities.Utilisateur;
import edu.iset.atelierSpringBoot.atelier1.services.UtilisateurService;

//annotation pour créér des webs service Rest avec le framework Spring web
@RestController
@RequestMapping("/Utilisateurs") // localhost:8080/Utilisateurs
@CrossOrigin(origins = "http://localhost:3000") // Remplacez par l'URL de votre application Flutter
public class UtilisateurController {
	@Autowired
	UtilisateurService utilisateurService;
	@GetMapping
	public List<Utilisateur> getAllUtilisateurs2() {
		return utilisateurService.getAllUtilisateur();
	}
	@PostMapping
	public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
		return utilisateurService.addUtilisateur(utilisateur);
	}
	@DeleteMapping(path="/{id}") // localhost:8080/Utilisateurs/3
	public void deletUtilisateur(@PathVariable Long id){
		utilisateurService.deleletUtilisateur(id);
	}
	@GetMapping("/{id}") // Pour obtenir un utilisateur par ID
    public Utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.findUtilisateurById(id);
    }

    @PutMapping("/{id}") // Pour mettre à jour un utilisateur par ID
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        utilisateur.setId(id); // Assurez-vous que l'ID est défini pour la mise à jour
        return utilisateurService.updateUtilisateur(utilisateur);
    }
    @GetMapping("/login") // Pour obtenir un utilisateur par ID
    public Utilisateur findfindByEmailAndPassword(@RequestBody LoginRequest loginRequest) {
        return utilisateurService.findByEmailAndPassword(loginRequest.getEmail(),loginRequest.getPassword());
    }
    

}
