package com.example.project.utils;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionAffichageVue {

    private Stage primaryStage;

    public GestionAffichageVue(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void affichageVue(ActionEvent actionEvent, String lienFXML) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(lienFXML));
            Parent libraryView = loader.load();

            Scene libraryScene = new Scene(libraryView);
            Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            stage.setWidth(400);
            stage.setHeight(700);
            stage.setScene(libraryScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
