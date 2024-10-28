package com.example.project.classes;

import java.time.LocalDate;
import java.util.Date;

public class Emprunt {
    private Utilisateur utilisateur;
    private Livre livre;
    private LocalDate datePret;
    private LocalDate dateRetour;
    private String statut;


    // Constructeur
    public Emprunt(Utilisateur utilisateur, Livre livre) {
        this.utilisateur = utilisateur;
        this.livre = livre;
        this.datePret = java.time.LocalDate.now();
        this.dateRetour = datePret.plusDays(14);
        this.statut = "retour";
    }

    // Getters et setters

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public LocalDate getDatePret() {
        return datePret;
    }

    public void setDatePret(LocalDate datePret) {
        this.datePret = datePret;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        if (statut.equals("Prete") || statut.equals("Retour")) { // Si le statut du livre est l'un des deux, on met à jour le statut
            this.statut = statut;
        }
        // Par défaut, on dit que le livre est de retour de base
        else
            this.statut = "Retour";
    }

    public void indiquerRetour(){
        dateRetour = java.time.LocalDate.now();
        statut = "Retour";
    }

    public void enRetard(){
        statut = "En retard";
    }
}
