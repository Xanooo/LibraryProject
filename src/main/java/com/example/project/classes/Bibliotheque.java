package com.example.project.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> listeLivre = new ArrayList<Livre>();
    private ArrayList<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();

    public Bibliotheque() {
    }

    public void ajoutLivre(Livre livre){
        listeLivre.add(livre);
    }

    public void supprimerLivre(Livre livre){
        listeLivre.remove(livre);
    }

    public void ajoutUtilisateur(Utilisateur utilisateur){
        listeUtilisateur.add(utilisateur);
    }

    public void supprimerUtilisateur(Utilisateur utilisateur){
        listeUtilisateur.remove(utilisateur);
    }

    public String afficherLivre(){
            for (Livre livre : listeLivre) {
                return livre.toString();
            }
            return "Aucun livre n'est présent dans la bibliothèque !";
    }

    public String  afficherUtilisateur(){
        for (Utilisateur utilisateur : listeUtilisateur){
            return utilisateur.toString();
        }
        return "Aucun utilisateur n'est inscrit dans la bibliothèque !";
    }
}
