package edu.iset.atelierSpringBoot.atelier1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Indique que cette classe contient des définitions de beans pour le contexte d'application
@EnableWebMvc // Active la configuration MVC, mais utilisez avec précaution dans Spring Boot
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/Utilisateurs/**") // Autoriser toutes les requêtes CORS
                .allowedOrigins("http://localhost:64980") // Autoriser l'origine de votre frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes autorisées
                .allowedHeaders("*"); // Autoriser tous les en-têtes
    }
}