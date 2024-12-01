package edu.iset.atelierSpringBoot.atelier1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iset.atelierSpringBoot.atelier1.entities.Utilisateur;
import edu.iset.atelierSpringBoot.atelier1.repositories.IUtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	@Autowired
	private IUtilisateurRepository utilisateurRepo;
	@Override
	public List<Utilisateur> getAllUtilisateur() {
	return utilisateurRepo.findAll();
	}
	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
	return utilisateurRepo.save(utilisateur);
	}
	// TODO : Compléter les autres méthodes en exploitant les méthodes prédéfinies de
	// IUtilisateurRepository
	@Override
	public Utilisateur findUtilisateurById(Long id) {
	    Optional<Utilisateur> utilisateur = utilisateurRepo.findById(id);
	    return utilisateur.orElse(null); // Retourne null si l'utilisateur n'est pas trouvé
	}
	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
	    if (utilisateurRepo.existsById(utilisateur.getId())) {
	        return utilisateurRepo.save(utilisateur); // Met à jour l'utilisateur
	    }
	    return null; // Retourne null si l'utilisateur n'existe pas
	}
	@Override
	public void deleletUtilisateur(Long id) {
	    if (utilisateurRepo.existsById(id)) {
	        utilisateurRepo.deleteById(id); // Supprime l'utilisateur
	    }
	}
	@Override
	public Utilisateur findByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return utilisateurRepo.findByEmailAndPassword( email,  password);
	}
}
