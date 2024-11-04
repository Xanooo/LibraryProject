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
        Livre.resetIDL();
        Utilisateur.resetIDU();
        bibliotheque = new Bibliotheque();
        livre = new Livre("Manon Lescaut", "Alfred de Musset");
        utilisateur = new Utilisateur("Xano", "xano@gmail.com");
    }

    /**
     * Fonction de test permettant de vérifier qu'un ajout de livre a été effectué
     */
    @Test
    public void ajoutLivreTest() {
        bibliotheque.ajoutLivre(livre);
        assertEquals("Identifiant: 1\nTitre: Manon Lescaut\nAuteur: Alfred de Musset\nDisponibilité: Disponible\n", bibliotheque.afficherLivre());
    }

    /**
     * Fonction permettant de vérifier si la suppression d'un livre est effectuée.
     */
    @Test
    public void deleteLivreTest(){
        bibliotheque.supprimerLivre(livre);
        assertEquals("Aucun livre n'est présent dans la bibliothèque !", bibliotheque.afficherLivre());
    }

    /**
     * Fonction de test permettant de vérifier qu'un utilisateur a été ajouté.
     */
    @Test
    public void ajoutUtilisateurTest(){
        bibliotheque.ajoutUtilisateur(utilisateur);
        assertEquals("ID: 1\nNom: Xano\nEmail: xano@gmail.com", bibliotheque.afficherUtilisateur());
    }

    /**
     * Fonction de test permettant de vérifier si la suppression d'un utilisateur est effectuée.
     */
    @Test
    public void deleteUtilisateurTest(){
        bibliotheque.supprimerUtilisateur(utilisateur);
        assertEquals("Aucun utilisateur n'est inscrit dans la bibliothèque !", bibliotheque.afficherUtilisateur());
    }
}
