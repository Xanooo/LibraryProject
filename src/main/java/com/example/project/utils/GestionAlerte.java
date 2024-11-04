package com.example.project.utils;

import javafx.scene.control.Alert;

public class GestionAlerte {
    public static void showAlert(String titre, String header, String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titre);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
