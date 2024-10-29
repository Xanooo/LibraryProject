package com.example.project.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Utilisateur {
    private final IntegerProperty idUtilisateur;
    private final StringProperty nom;
    private final StringProperty prenom;
    private final StringProperty email;

    /**
     *
     * @param idUtilisateur
     * @param nom
     * @param prenom
     * @param email
     */
    public Utilisateur(int idUtilisateur, String nom, String prenom, String email) {
        this.idUtilisateur = new SimpleIntegerProperty(idUtilisateur);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.email = new SimpleStringProperty(email);
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
    public StringProperty prenomProperty() { return prenom; }

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
     * @param nom
     */
    public void setNom(String nom) { this.nom.set(nom); }

    /**
     *
     * @return
     */
    public String getPrenom() { return prenom.get(); }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) { this.prenom.set(prenom); }

    /**
     *
     * @return
     */
    public String getEmail() { return email.get(); }

    /**
     *
     * @param email
     */
    public void setEmail(String email) { this.email.set(email); }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "ID: " + idUtilisateur.get() + "\nNom: " + nom.get() + "\nPrénom: " + prenom.get() + "\nEmail: " + email.get();
    }
}
