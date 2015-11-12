/*
    Une application qui utilise des méthodes pour gérer le contenu d'un tableau
    de 10 entiers positifs.

    Entrées:
        Paramètres de méthodes(valeurs)      int
    Sorties:
        Tableau de valeurs                  String
        Position                            int

    Traitements:
        Déclaration et initialisation(à -1) d'un tableau.
        Dans une boucle do-while, demander ce que veut l'utilisateur avec
        des options(1 à 6).
        Faire appel aux méthodes appropriés pour gérer le contenu d'un tableau.
        Les méthodes static pour gérer un tableau sont dans la classe Tableau.
*/
import javax.swing.*;
class TestTableau {
    public static void main(String[] args) {
        //  initialiser tous les éléments du tableau à -1; -1 signifie vide
        int[] tab = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int valeur;     //  opérations sur valeur
        int valeur2;    //  variable utilisé lors de l'appel de la méthode modifierValeur
        String lecture;     //  variable tampon de lecture
        int choix;
        
        boolean recommencer = true;        //  Sert à déterminer si on doit recommencer
        do {
            lecture = JOptionPane.showInputDialog("1- Ajouter un élément\n"
                    + "2- Rechercher un élément\n"
                    + "3- Supprimer un élément\n"
                    + "4- Modifier un élément\n"
                    + "5- Afficher le tableau\n"
                    + "6- Quitter");
            choix = Integer.parseInt(lecture);
           
            switch (choix) {
                case 1:
                    lecture = JOptionPane.showInputDialog("Entrez la valeur à ajouter:");
                    valeur = Integer.parseInt(lecture);
                    int plein = Tableau.ajouterValeur(tab, valeur);
                    //  si l'utilisateur veut ajouter une valeur, alors que le tableau est plein
                    //  si la valeur de retour de la méthode ajouterValeur retoune -1
                    if (plein == -1){
                        JOptionPane.showMessageDialog(null, "Le tableau est plein !");
                    }
                    break;
                case 2:
                    lecture = JOptionPane.showInputDialog("Entrez la valeur à rechercher:");
                    valeur = Integer.parseInt(lecture);
                    //  on affiche la position retournée
                    JOptionPane.showMessageDialog(null, "Position: " + Tableau.rechercherValeur(tab, valeur));
                    break;
                case 3:
                    lecture = JOptionPane.showInputDialog("Entrez la valeur à supprimer:");
                    valeur = Integer.parseInt(lecture);
                    Tableau.supprimerValeur(tab, valeur);
                    break;
                case 4:
                    lecture = JOptionPane.showInputDialog("Entrez l'ancienne valeur:");
                    valeur = Integer.parseInt(lecture);
                    lecture = JOptionPane.showInputDialog("Entrez la nouvelle valeur:");
                    valeur2 = Integer.parseInt(lecture);
                    Tableau.modifierValeur(tab, valeur, valeur2);
                    break;
                case 5:
                    Tableau.afficherTableau(tab);
                    break;
                case 6:
                    recommencer = false;
                    break;
                default:
                    //  si on ne suit pas les consignes
                    JOptionPane.showMessageDialog(null, "Vous devez choisir les options (entre 1 et 6)");
            }
        } while (recommencer);
    }
}

public class Tableau {

    //  méthode static qui reçcoit le tableau et la valeur à ajouter
    public static int ajouterValeur(int[] tab, int valeurAjoute) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == -1) {
                //  ajoute la valeur à l'index qui contenait -1
                tab[i] = valeurAjoute;
                return i;
            }
        }
        //  si le tableau est plein
        return -1;
    }

    //  méthode static qui reçoit le tableau et la valeur à chercher.
    public static int rechercherValeur(int[] tab, int valeurRecherche) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurRecherche) {
                //  si la condition a trouvé la valeur recherchée, retourner la position
                return i;
            }
        }
        //  sinon retourne -1
        return -1;
    }

    //  méthode static qui reçoit le tableau et la valeur à supprimer
    public static int supprimerValeur(int[] tab, int valeurSuppr) {
        //  si la valeur existe (différente de -1 donc existante)
        if (rechercherValeur(tab, valeurSuppr) != -1) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == valeurSuppr) {
                    tab[i] = -1;
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    //  méthode static qui reçoit le tableau, la valeur à modifier et la nouvelle valeur
    public static int modifierValeur(int[] tab, int ancienneValeur, int nouvelleValeur) {
        //  si la valeur existe (différente de -1 donc existante)
        if (rechercherValeur(tab, ancienneValeur) != -1) {
            for (int i = 0; i < tab.length; i++) {
                //  Si on trouve la valeur à modifier
                if (tab[i] == ancienneValeur) {
                    //  Attribuer la nouvelle valeur
                    tab[i] = nouvelleValeur;
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    //  méthode static void (ne retourne rien) qui affiche un tableau sous forme de JTextArea
    public static void afficherTableau(int[] tab) {

        JTextArea textarea = new JTextArea();
        String output = "Valeurs du tableau";
        output += "\n_____________________";

        for (int i = 0; i < tab.length; i++) {
            //  si la boucle for trouve une valeur
            if (tab[i] != -1) {
                output += "\n" + tab[i];
            }
        }

        int vide = 0,
                plein = 0;      //  variables permettant de compter le nombre d'éléments vides ou pleins.      
        //  vérifier si le tableau est vide ou plein
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == -1) {
                vide++;
            } else if (tab[i] != -1) {
                plein++;
            }
        }

        //  si le tableau est vide 10 fois, c'est-à-dire qu'il est complétement vide
        if (vide == 10) {
            output += "\nLe tableau est vide !";
        }
        //  si le tableau est plein 10 fois, c'est-à-dire qu'il est complétement plein
        if (plein == 10) {
            output += "\nLe tableau est plein !";
        }

        textarea.setText(output);

        JOptionPane.showMessageDialog(null, textarea, "Éléments du tableau", JOptionPane.INFORMATION_MESSAGE);
    }
}
/*
    Par M. Chraiet
*/
