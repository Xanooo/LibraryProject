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

    /*
    Fonction de set-up permettant d'instancier les classes.
     */
    @Before
    public void setUp() throws Exception {
        bibliotheque = new Bibliotheque();
        livre = new Livre("Manon Lescaut", "Alfred de Musset", true, 1);
        utilisateur = new Utilisateur("Arris", 1);
    }

    /**
     * Fonction de com.example.project.test
     */
    @Test
    public void ajoutLivreTest() {
        bibliotheque.ajoutLivre(livre);
        assertEquals("Identifiant: 1\nTitre: Manon Lescaut\nAuteur: Alfred de Musset\nDisponibilité: disponible\n", bibliotheque.afficherLivre());
    }

    /*
    Fonction de com.example.project.test permettant de vérifier si la suppression d'un livre est effectuée.
     */
    @Test
    public void deleteLivreTest(){
        bibliotheque.supprimerLivre(livre);
        assertEquals("Aucun livre n'est présent dans la bibliothèque !", bibliotheque.afficherLivre());
    }

    /*
    Fonction de com.example.project.test permettant de vérifier si l'ajout d'un utilisateur est effectué.
     */
    @Test
    public void ajoutUtilisateurTest(){
        bibliotheque.ajoutUtilisateur(utilisateur);
        assertEquals("Identifiant: 1\nNom: Arris\n", bibliotheque.afficherUtilisateur());
    }

    /*
    Fonction de com.example.project.test permettant de vérifier si la suppression d'un utilisateur est effectuée.
     */
    @Test
    public void deleteUtilisateurTest(){
        bibliotheque.supprimerUtilisateur(utilisateur);
        assertEquals("Aucun utilisateur n'est inscrit dans la bibliothèque !", bibliotheque.afficherUtilisateur());
    }
}
