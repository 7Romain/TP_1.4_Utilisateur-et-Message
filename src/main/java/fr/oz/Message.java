package fr.oz;

import java.text.DateFormat;
import java.util.Date;

public class Message {
    private String titre;
    private String texte;
    private Date dateCreation;
    private Utilisateur utilisateur;
    Forum forum;

    public Message(String titre, String texte, Utilisateur utilisateur, Forum forum) {
        this.titre = titre;
        this.texte = texte;
        this.utilisateur = utilisateur;
        this.forum = forum;
        dateCreation = new Date();

        this.forum.ajouterUtilisateurMessages(new MessageUtilisateur(utilisateur, this));

    }

    public String getAuteur() {
        return String.format("%s %s, %s", utilisateur.getPrenom(), utilisateur.getNom(), utilisateur.getStatut());
    }

    public String getDateCreation() {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        return df.format(dateCreation);
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return String.format("%s -- %s %nDate de création : %s %n%s", titre, texte, getDateCreation(), utilisateur);

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

}
