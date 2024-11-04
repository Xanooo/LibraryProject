package com.example.project.controllers;


import com.example.project.models.Livre;
import com.example.project.utils.GestionAffichageVue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import com.example.project.utils.GestionAlerte;


import java.io.IOException;

public class GestionLivreController extends Controller{


    private final GestionAffichageVue gestionAffichageVue;

    public GestionLivreController(){
        gestionAffichageVue = new GestionAffichageVue();
    }


    @FXML
    TextField titreLivre;

    @FXML
    TextField auteurLivre;
    /**
     *
     * @param actionEvent
     * @throws IOException
     */
    public void onAddButtonClick(ActionEvent actionEvent) throws IOException {
        gestionAffichageVue.affichageVue(actionEvent, "/com/example/project/fxml/ajoutLivreFormPage.fxml.fxml");
    }
    /**
     *
     * @param actionEvent
     * @throws IOException
     */
    public void onRetourGestionLivre(ActionEvent actionEvent) throws IOException {
        gestionAffichageVue.affichageVue(actionEvent, "/com/example/project/fxml/gestionLivrePage.fxml");
    }

    public void onEditButtonClick(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/project/fxml/editLivreFormPage.fxml"));
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

    /**
     *
     */
    public void handleAddBook(){
        String titre = titreLivre.getText();
        String auteur = auteurLivre.getText();

        // Si il n'y a aucun titre/utilisateur, afficher une alerte
        if (titre.isEmpty() || auteur.isEmpty()){
            GestionAlerte.showAlert("Erreur lors de l'ajout du livre", "Titre ou auteur non renseignés", "Veuillez renseigner tous les champs !");
            clearFields();
            return;
        }


        Livre livre = new Livre(titreLivre.getText(), auteurLivre.getText());
        System.out.println("Livre crée !");
        System.out.println(titre);
        System.out.println(auteur);
        GestionAlerte.showAlert("Ajout du livre réussi", titre + "\n" + auteur,"Le livre a été ajouté avec succès !");
        clearFields();
    }



    public void clearFields(){
        titreLivre.clear();
        auteurLivre.clear();
    }
}
