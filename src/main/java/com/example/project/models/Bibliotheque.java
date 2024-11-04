package com.example.project.models;

import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> listeLivre = new ArrayList<>();
    private ArrayList<Utilisateur> listeUtilisateur = new ArrayList<>();

    public Bibliotheque() {
    }

    /**
     * Ajoute un livre à la bibliothèque
     * @param livre : un livre qu'on souhaite ajouter
     */
    public void ajoutLivre(Livre livre){
        listeLivre.add(livre);
    }

    /**
     * Supprime un livre de la bibliothèque
     * @param livre : un livre qu'on souhaite supprimer
     */
    public void supprimerLivre(Livre livre){
        listeLivre.remove(livre);
    }

    /**
     * Ajout un utilisateur à la bibliothèque
     * @param utilisateur : un utilisateur qu'on souhaite ajouter
     */
    public void ajoutUtilisateur(Utilisateur utilisateur){
        listeUtilisateur.add(utilisateur);
    }

    /**
     * Supprime un utilisateur de la bibliothèque
     * @param utilisateur : un utilisateur qu'on souhaite supprimer
     */
    public void supprimerUtilisateur(Utilisateur utilisateur){
        listeUtilisateur.remove(utilisateur);
    }

    /**
     * Affiche tous les livres de la bibliothèque
     * @return : renvoie tous les livres, ou aucun
     */
    public String afficherLivre(){
            for (Livre livre : listeLivre) {
                return livre.toString();
            }
            return "Aucun livre n'est présent dans la bibliothèque !"; // Si aucun livre n'est présent
    }

    /**
     * Affiche tous les utilisateurs de la bibliothèque
     * @return : renvoie tous les utilisateurs, ou aucun
     */
    public String  afficherUtilisateur(){
        for (Utilisateur utilisateur : listeUtilisateur){
            return utilisateur.toString();
        }
        return "Aucun utilisateur n'est inscrit dans la bibliothèque !"; // Si aucun utilisateur n'est présent.
    }
}
