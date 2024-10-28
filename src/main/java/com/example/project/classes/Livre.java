package com.example.project.classes;

public class Livre {
    private String titre;
    private String auteur;
    private boolean disponible;
    private int id_livre;

    /**
     *
     * @param titre
     * @param auteur
     * @param disponible
     * @param id
     */
    public Livre(String titre, String auteur, boolean disponible, int id) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
        this.id_livre = id;
    }

    // Getters et setters

    /**
     * Fonction renvoyant le titre du Livre
     */
    public String getTitre() {
        return titre;
    }

    /**
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     *
     * @return
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     *
     * @param auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     *
     * @return
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     *
     * @param disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     *
     * @return
     */
    public int getId_livre() {
        return id_livre;
    }

    /**
     *
     * @param id_livre
     */
    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String dispoFR;
        if (disponible){
            dispoFR = "disponible";
        }
        else {
            dispoFR = "non-disponible";
        }
        return "Identifiant: " + id_livre + "\nTitre: " + titre + "\nAuteur: " + auteur + "\nDisponibilité: " + dispoFR + "\n";
    }
}
