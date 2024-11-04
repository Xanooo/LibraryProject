package com.example.project.test;
import com.example.project.models.Emprunt;
import com.example.project.models.Livre;
import com.example.project.models.Utilisateur;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

import java.time.LocalDate;

public class EmpruntTest {
    Utilisateur utilisateur;
    Livre livre;
    Emprunt emprunt;

    /**
     * Fonction de setUp qui instancie nos classes
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        utilisateur = new Utilisateur("Xano", "xano@gmail.com");
        livre = new Livre("Le Rouge et le Noir", "Stendhal");
        emprunt = new Emprunt(utilisateur, livre);
    }

    /**
     * Fonction de test permettant de vérifier si le statut peut être changé, et vérifie qu'il n'existe que
     * deux conditions possibles : Disponible et Non-disponible.
     */
    @Test
    public void setStatutTest() {
        emprunt.setStatut("Non-disponible");
        assertEquals("Non-disponible", emprunt.getStatut());

        emprunt.setStatut("Testons un mot invalide");
        assertEquals("Disponible", emprunt.getStatut());
    }

    /**
     * Vérifie que la disponibilité et la date de retour sont mises à jour en cas de retour d'un livre.
     */
    @Test
    public void indiquerRetourTest(){
        emprunt.indiquerRetour();
        assertEquals("Disponible", emprunt.getStatut());
        assertEquals(LocalDate.now(), emprunt.getDateRetour());
    }
}
