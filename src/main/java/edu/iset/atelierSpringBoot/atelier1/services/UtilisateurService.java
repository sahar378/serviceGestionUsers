package edu.iset.atelierSpringBoot.atelier1.services;

import java.util.List;

import edu.iset.atelierSpringBoot.atelier1.entities.Utilisateur;

public interface UtilisateurService {
	public List<Utilisateur> getAllUtilisateur();
	public Utilisateur findUtilisateurById(Long id);
	public Utilisateur addUtilisateur(Utilisateur utilisateur);
	public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	public void deleletUtilisateur(Long id);
	public Utilisateur findByEmailAndPassword(String email, String password);
}
