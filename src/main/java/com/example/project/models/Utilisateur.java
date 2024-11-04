package com.example.project.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Utilisateur {
    private static int IDU = 1;
    private final IntegerProperty idUtilisateur;
    private final StringProperty nom;
    private final StringProperty email;

    /**
     * Le constructeur de notre classe Utilisateur
     * @param nom : le nom de l'utilisateur
     * @param email : l'email de l'utilisateur
     */
    public Utilisateur(String nom, String email) {
        this.idUtilisateur = new SimpleIntegerProperty(IDU);
        this.nom = new SimpleStringProperty(nom);
        this.email = new SimpleStringProperty(email);
        IDU++;
    }

    /**
     *
     * @return
     */
    public IntegerProperty idUtilisateurProperty() { return idUtilisateur; }

    /**
     *
     * @return
     */
    public StringProperty nomProperty() { return nom; }


    /**
     *
     * @return
     */
    public StringProperty emailProperty() { return email; }


    /**
     *
     * @return
     */
    public int getIdUtilisateur() { return idUtilisateur.get(); }

    /**
     *
     * @param id
     */
    public void setIdUtilisateur(int id) { this.idUtilisateur.set(id); }

    /**
     *
     * @return
     */
    public String getNom() { return nom.get(); }

    /**
     *
     * @param nom : nouveau nom de l'utilisateur
     */
    public void setNom(String nom) { this.nom.set(nom); }

    /**
     * Fonction renvoyant l'email de l'utilisateur
     * @return : renvoie l'email de l'utilisateur
     */
    public String getEmail() { return email.get(); }

    /**
     * Met à jour l'email de l'utilisateur
     * @param email : notre nouvel email
     */
    public void setEmail(String email) { this.email.set(email); }

    /**
     * Fonction affichant les informations d'un utilisateyr
     * @return : un string contenant le nom, l'email et l'identifiant d'un utilisateur
     */
    @Override
    public String toString() {
        return "ID: " + idUtilisateur.get() + "\nNom: " + nom.get()  + "\nEmail: " + email.get();
    }

    /**
     *
     */
    public static void resetIDU(){
        IDU = 1;
    }
}
