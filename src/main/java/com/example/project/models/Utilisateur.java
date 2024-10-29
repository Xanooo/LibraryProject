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

    // Getters pour les propriétés JavaFX
    public IntegerProperty idUtilisateurProperty() { return idUtilisateur; }
    public StringProperty nomProperty() { return nom; }
    public StringProperty prenomProperty() { return prenom; }
    public StringProperty emailProperty() { return email; }

    // Getters et setters standards
    public int getIdUtilisateur() { return idUtilisateur.get(); }
    public void setIdUtilisateur(int id) { this.idUtilisateur.set(id); }

    public String getNom() { return nom.get(); }
    public void setNom(String nom) { this.nom.set(nom); }

    public String getPrenom() { return prenom.get(); }
    public void setPrenom(String prenom) { this.prenom.set(prenom); }

    public String getEmail() { return email.get(); }
    public void setEmail(String email) { this.email.set(email); }

    @Override
    public String toString() {
        return "ID: " + idUtilisateur.get() + "\nNom: " + nom.get() + "\nPrénom: " + prenom.get() + "\nEmail: " + email.get();
    }
}
