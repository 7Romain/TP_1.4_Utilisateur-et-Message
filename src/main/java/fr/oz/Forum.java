package fr.oz;

public class Forum {
    final int NBR_MESSAGES = 9;
    int compteur = 0;
    MessageUtilisateur[] tablMessage;

    public Forum() {
        tablMessage = new MessageUtilisateur[NBR_MESSAGES];
    }

    public boolean ajouterUtilisateurMessages(MessageUtilisateur mu) {
        try {

            tablMessage[compteur] = mu;
        } catch (IndexOutOfBoundsException ioobe) {
            return false;

        }
        compteur++;
        return true;

    }

    String getListeMessageAuteur() {
        String totale = "";
        for (int i = 0; i < tablMessage.length; i++) {
            if (!(tablMessage[i] instanceof MessageUtilisateur)) {
                continue;
            }

            String tour = String.format("%s%n", tablMessage[i].getMessage());
            totale += tour;

        }
        return totale;
    }

}
