package com.example.project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Controller {
    public void onRetourButtonClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/project/fxml/mainPage.fxml"));
            Parent libraryView = loader.load();

            // Créer une nouvelle scène
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
}
