package com.example.project.classes;

public class Utilisateur {
    private String nom;
    private int id_utilisateur;

    public Utilisateur(String nom, int id_utilisateur) {
        this.nom = nom;
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String toString(){
        return "Identifiant: " + id_utilisateur + "\nNom: " + nom + "\n";
    }
}
