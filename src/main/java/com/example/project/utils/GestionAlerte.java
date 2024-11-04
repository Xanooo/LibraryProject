package com.example.project.utils;

import javafx.scene.control.Alert;

public class GestionAlerte {
    public static void showAlert(String titre, String header, String message, Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(titre);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void successAlert(String titre, String header, String message){
        showAlert(titre, header, message, Alert.AlertType.INFORMATION);
    }
    public static void errorAlert(String titre, String header, String message){
        showAlert(titre, header, message, Alert.AlertType.ERROR);

    }
}
