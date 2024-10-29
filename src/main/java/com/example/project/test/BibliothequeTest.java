package com.example.project.test;

import com.example.project.models.Bibliotheque;
import com.example.project.models.Livre;
import com.example.project.models.Utilisateur;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class BibliothequeTest {
    Bibliotheque bibliotheque;
    Utilisateur utilisateur;
    Livre livre;

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        bibliotheque = new Bibliotheque();
        livre = new Livre("Manon Lescaut", "Alfred de Musset", true, 1);
        utilisateur = new Utilisateur(1, "Tamine", "Cyril", "xano@gmail.com");
    }

    /**
     * Fonction de com.example.project.test
     */
    @Test
    public void ajoutLivreTest() {
        bibliotheque.ajoutLivre(livre);
        assertEquals("Identifiant: 1\nTitre: Manon Lescaut\nAuteur: Alfred de Musset\nDisponibilité: disponible\n", bibliotheque.afficherLivre());
    }

    /**
     * Fonction de com.example.project.test permettant de vérifier si la suppression d'un livre est effectuée.
     */
    @Test
    public void deleteLivreTest(){
        bibliotheque.supprimerLivre(livre);
        assertEquals("Aucun livre n'est présent dans la bibliothèque !", bibliotheque.afficherLivre());
    }

    /**
     *
     */
    @Test
    public void ajoutUtilisateurTest(){
        bibliotheque.ajoutUtilisateur(utilisateur);
        assertEquals("ID: 1\nNom: Tamine\nPrénom: Cyril\nEmail: xano@gmail.com", bibliotheque.afficherUtilisateur());
    }

    /**
     * Fonction de com.example.project.test permettant de vérifier si la suppression d'un utilisateur est effectuée.
     */
    @Test
    public void deleteUtilisateurTest(){
        bibliotheque.supprimerUtilisateur(utilisateur);
        assertEquals("Aucun utilisateur n'est inscrit dans la bibliothèque !", bibliotheque.afficherUtilisateur());
    }
}
