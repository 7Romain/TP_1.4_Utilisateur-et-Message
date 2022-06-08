package fr.oz;

import fr.oz.types.CategorieUtilisateur;

/**
 * @author Romain.b
 * @version 0.1
 * 
 *
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private CategorieUtilisateur statut;

    public Utilisateur(String prenom, String nom, CategorieUtilisateur statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CategorieUtilisateur getStatut() {
        return statut;
    }

    public void setStatut(CategorieUtilisateur statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return String.format("Utilisateur : %s %s, %s", prenom, nom, statut);

    }

}
