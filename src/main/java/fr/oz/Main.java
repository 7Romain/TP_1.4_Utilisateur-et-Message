package fr.oz;

import javax.swing.JOptionPane;

import fr.oz.types.CategorieUtilisateur;

public class Main {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Forum forum2 = new Forum();
        Utilisateur jean = new Utilisateur("Jean", "Dupont", CategorieUtilisateur.STANDARD);
        Utilisateur bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateur.STANDARD);
        Utilisateur nathalie = new Utilisateur("Nathalie", "Morin", CategorieUtilisateur.MODERATEUR);

        JOptionPane.showMessageDialog(null, nathalie, nathalie.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, bernard, bernard.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, jean, jean.getPrenom(), JOptionPane.INFORMATION_MESSAGE);

        Message message1 = new Message("Java SEvv", "L'encapsulation est une propriété fondamentaledd",
                jean, forum);

        Message message2 = new Message("Java SExx", "L'encapsulation est une propriété fondamentalessaa",
                nathalie, forum);
        Message message3 = new Message("Java SEww", "L'encapsulation est une propriété fondamentaleazzz",
                jean, forum);
        Message message4 = new Message("Java SEss", "L'encapsulation est une propriété fondamentaleeeedd",
                nathalie, forum);
        Message message5 = new Message("Java SEaza", "L'encapsulation est une propriété fondamentaledddd",
                bernard, forum2);
        Message message6 = new Message("Java SE", "L'encapsulation est une propriété fondamentalffffe",
                bernard, forum2);

        JOptionPane.showMessageDialog(null, forum.getListeMessageAuteur(), "Messages", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, forum2.getListeMessageAuteur(), "Messages",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
