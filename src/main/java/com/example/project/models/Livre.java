package com.example.project.models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Livre {
    private final StringProperty titre;
    private final StringProperty auteur;
    private final BooleanProperty disponible;
    private final IntegerProperty id_livre;
    private static int IDL=1;

    /**
     * Constructeur de la classe Livre
     * @param titre : titre du livre
     * @param auteur : auteur d'un livre
     */
    public Livre(String titre, String auteur) {
        this.titre = new SimpleStringProperty(titre);
        this.auteur = new SimpleStringProperty(auteur);
        this.disponible = new SimpleBooleanProperty(true);
        this.id_livre = new SimpleIntegerProperty(IDL);
        IDL++;
    }

    /**
     *
     * @return
     */
    public StringProperty titreProperty() { return titre; }

    /**
     *
     * @return
     */
    public StringProperty auteurProperty() { return auteur; }

    /**
     *
     * @return
     */
    public BooleanProperty disponibleProperty() { return disponible; }

    /**
     *
     * @return
     */
    public IntegerProperty idLivreProperty() { return id_livre; }

    // Getters et setters standards

    /**
     *
     * @return
     */
    public String getTitre() { return titre.get(); }

    /**
     *
     * @param titre
     */
    public void setTitre(String titre) { this.titre.set(titre); }

    /**
     *
     * @return
     */
    public String getAuteur() { return auteur.get(); }

    /**
     *
     * @param auteur
     */
    public void setAuteur(String auteur) { this.auteur.set(auteur); }

    /**
     *
     * @return
     */
    public boolean isDisponible() { return disponible.get(); }

    /**
     * Setter permettant de changer la disponibilité d'un livre
     * @param disponible : booléen indiquant la disponibilité du livre
     */
    public void setDisponible(boolean disponible) { this.disponible.set(disponible); }

    /**
     *
     * @return
     */
    public int getIdLivre() { return id_livre.get(); }

    /**
     *
     * @param id
     */
    public void setIdLivre(int id) { this.id_livre.set(id); }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String dispoFR = disponible.get() ? "Disponible" : "Non-disponible"; // Permet de convertir le booléen en string
        return "Identifiant: " + id_livre.get() + "\nTitre: " + titre.get() + "\nAuteur: " + auteur.get() + "\nDisponibilité: " + dispoFR + "\n";
    }

    /**
     *
     */
    public static void resetIDL(){
        IDL = 1;
    }
}
