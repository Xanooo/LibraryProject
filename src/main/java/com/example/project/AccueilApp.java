package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccueilApp extends Application {
    /**
     * Met en place notre scène et notre stage principale, la page d'accueil.
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AccueilApp.class.getResource("fxml/mainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 700);
        stage.setTitle("LibraryApp");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Lance le programme
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}