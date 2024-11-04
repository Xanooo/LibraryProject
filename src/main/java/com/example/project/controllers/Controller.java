package com.example.project.controllers;

import com.example.project.utils.GestionAffichageVue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Classe abstraite permettant de regrouper des fonctions communes aux autres contrôleurs, tel que le retour au menu.

public abstract class Controller {

    private final GestionAffichageVue gestionAffichageVue;
    public Controller(){
        gestionAffichageVue = new GestionAffichageVue();
    }
    /**
     * Permet de retourner à l'accueil
     * @param event : un évènement
     */
    public void onRetourButtonClick(ActionEvent event) {
        gestionAffichageVue.affichageVue(event, "/com/example/project/fxml/mainPage.fxml");

    }
}
