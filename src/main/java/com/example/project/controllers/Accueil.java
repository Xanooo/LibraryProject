package com.example.project.controllers;

import com.example.project.AccueilApp;
import com.example.project.utils.GestionAffichageVue;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Accueil {

    private final GestionAffichageVue gestionAffichageVue;

    public Accueil(){
        gestionAffichageVue = new GestionAffichageVue();
    }
    /**
     * Permet d'accéder à la page de gestion des livres
     * @param event : un évènement
     */
    public void onGestionLivresButtonClick(ActionEvent event) {
        gestionAffichageVue.affichageVue(event, "/com/example/project/fxml/gestionLivrePage.fxml");
    }

    /**
     * Permet d'accéder à la page de gestion des utilisateurs.
     * @param event : un évènement
     */
    public void onGestionUtilisateurButtonClick(ActionEvent event) {
       gestionAffichageVue.affichageVue(event, "/com/example/project/fxml/gestionUtilisateurPage.fxml");
    }

    /**
     * Permet d'accéder à la page de gestion des emprunts.
     * @param event : un évènement
     */
    public void onGestionEmpruntButtonClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/project/fxml/gestionEmpruntPage.fxml"));
            Parent libraryView = loader.load();

            Scene libraryScene = new Scene(libraryView);
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setWidth(400);
            stage.setHeight(700);
            stage.setScene(libraryScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Ferme la fenêtre
     * @param event : un évènement
     */
    public void closeActionButtonClick(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}