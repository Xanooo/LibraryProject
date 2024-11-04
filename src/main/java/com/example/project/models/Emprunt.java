package com.example.project.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Emprunt {
    private Utilisateur utilisateur;
    private Livre livre;
    private ObjectProperty<LocalDate> datePret;
    private ObjectProperty<LocalDate> dateRetour;
    private StringProperty statut;

    /**
     *
     * @param utilisateur
     * @param livre
     */
    public Emprunt(Utilisateur utilisateur, Livre livre) {
        this.utilisateur = utilisateur;
        this.livre = livre;
        this.datePret = new SimpleObjectProperty<>(LocalDate.now());
        this.dateRetour = new SimpleObjectProperty<>(datePret.get().plusDays(14));
        this.statut = new SimpleStringProperty("Disponible");
    }


    /**
     *
     * @return
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     *
     * @param utilisateur
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    /**
     *
     * @return
     */
    public Livre getLivre() {
        return livre;
    }

    /**
     *
     * @param livre
     */
    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    /**
     *
     * @return
     */
    public LocalDate getDatePret() {
        return datePret.get();
    }

    /**
     *
     * @param datePret
     */
    public void setDatePret(LocalDate datePret) {
        this.datePret.set(datePret);
    }

    /**
     *
     * @return
     */
    public ObjectProperty<LocalDate> datePretProperty() {
        return datePret;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateRetour() {
        return dateRetour.get();
    }

    /**
     *
     * @param dateRetour
     */
    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour.set(dateRetour);
    }

    /**
     *
     * @return
     */
    public ObjectProperty<LocalDate> dateRetourProperty() {
        return dateRetour;
    }

    /**
     *
     * @return
     */
    public String getStatut() {
        return statut.get();
    }

    /**
     *
     * @param statut
     */
    public void setStatut(String statut) {
        if (statut.equals("Non-disponible") || statut.equals("Disponible")) {
            this.statut.set(statut);
        } else {
            this.statut.set("Disponible");
        }
    }

    /**
     *
     * @return
     */
    public StringProperty statutProperty() {
        return statut;
    }

    /**
     *
     */
    public void indiquerRetour() {
        dateRetour.set(LocalDate.now());
        statut.set("Disponible");
    }

    /**
     *
     */
    public void enRetard() {
        statut.set("En retard");
    }
}
