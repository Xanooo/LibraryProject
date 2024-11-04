package com.example.project;

import com.example.project.models.Bibliotheque;
import com.example.project.models.Livre;

public class Main {
    public static void main(String[] args) {
        Livre livre = new Livre("Ashita no Joe", "Tatsuya Chiba");
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("Jujutsu Kaisen", "Gege Akutami");
        bibliotheque.ajoutLivre(livre);
        bibliotheque.ajoutLivre(livre1);
        System.out.println(bibliotheque.afficherLivre());
    }
}
