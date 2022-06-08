package fr.oz;

import java.util.ArrayList;
import java.util.Iterator;

public class Forum {
    final int NBR_MESSAGES = 9;
    int compteur = 0;
    ArrayList<MessageUtilisateur> tablMessage;

    public Forum() {
        tablMessage = new ArrayList<MessageUtilisateur>();
    }

    public void ajouterUtilisateurMessages(MessageUtilisateur mu) {

        tablMessage.add(mu);

    }

    String getListeMessageAuteur() {
        String totale = "";
        Iterator<MessageUtilisateur> i = tablMessage.iterator();
        while (i.hasNext()) {
            String tour = String.format("%s%n", i.next().getMessage());
            totale += tour;
        }

        return totale;
    }

}
