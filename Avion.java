/*
    Effectuer la programmation du nouveau système et rédiger un programme
    qui affecte les 10 sièges du seul avion de la compagnie.
    Un programme qui attribue automatiquement un numéro de siège de 1 à 5
    pour un non-fumeur et un numéro de siège de 6 à 10 pour un fumeur.

    Entrées:
        0, 1 ou 2           int
        
    Sorties:
        Numéro de siège     int

    Traitements:
        Dans une boucle do-while,  demander si c'est un fumeur ou
        non-fumeur. Selon son choix, vérifier si il reste de la place
        pour cette section. Si il reste de la place, boucler sur cette section
        afin de vérifier dans quel numéro de siège(index) il faudra assigner le nouveau siège.
        Affichage!
 */ 

import javax.swing.*;
public class Avion {

    public static void main(String[] args) {
        int siege;
        String lecture;                 //  Variable tampon de lecture
        int[] sieges = new int[11];     //  11 éléments car 0 non utilisé

        do {
            lecture = JOptionPane.showInputDialog("Pressez 1 pour un siège dans la section non-fumeur\n"
                    + "Pressez 2 pour un siège dans la section fumeur\n"
                    + "Pressez 0 pour quitter le système");
            siege = Integer.parseInt(lecture);
            //  Si c'est un non-fumeur
            if (siege == 1) {
                //  si il n'y a plus de place dans la section non-fumeur
                if (sieges[5] == 1) {
                    JOptionPane.showMessageDialog(null, "Il n'y a plus de places dans la section demandée");
                } else {
                    for (int i = 1; i <= 5; i++) {
                        //  Si la boucle a trouvé un siège à 0 pour lui assigner un nouveau siège à 1
                        if (sieges[i] == 0) {
                            sieges[i] = 1;
                            JOptionPane.showMessageDialog(null, "Numéro de siège : " + i+"\nSection : Non fumeur","Carte d'embarquement",JOptionPane.INFORMATION_MESSAGE);
                            //  briser la boucle for car on a assigné le siège
                            break;
                        }
                    }
                }
            //  Si c'est un fumeur
            } else if (siege == 2) {
                //  si il n'y a plus de place dans la section fumeur
                if (sieges[10] == 2){
                    JOptionPane.showMessageDialog(null, "Il n'y a plus de places dans la section demandée");
                } else {
                    for (int i = 6; i <= 10; i++) {
                        //  Si la boucle a trouvé un siège à 0 pour lui assigner un nouveau siège à 2
                        if (sieges[i] == 0){
                            sieges[i] = 2;
                            JOptionPane.showMessageDialog(null, "Numéro de siège : " + i+"\nSection : Fumeur","Carte d'embarquement",JOptionPane.INFORMATION_MESSAGE);
                            //  briser la boucle for car on a assigné le siège
                            break;
                        }
                    }
                }               
            }
            //  Répéter la boucle tant que siège ne vaut pas 0
        } while (siege != 0);
    }
}
/*
    Par M. Chraiet
*/
