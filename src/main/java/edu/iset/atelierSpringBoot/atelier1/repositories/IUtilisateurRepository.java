package edu.iset.atelierSpringBoot.atelier1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.iset.atelierSpringBoot.atelier1.entities.Utilisateur;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	//la 1ére méthode 
	//public Utilisateur findByEmailAndPassword(String email, String password);
	//la 2éme méthode
	@Query("SELECT u FROM Utilisateur u WHERE u.email = :email AND u.password = :password")
    Utilisateur findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}
