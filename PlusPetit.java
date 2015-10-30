/*
    Une application qui lit 10 nombres entiers, les emmagasine dans un tableau
    et recherche par la suite le plus petit.

    Entrées:
        10 entiers      int

    Sorties:
        plusPetit       int

    Traitements:
        Effectuer la lecture des 10 entiers avec une boucle for.
        Prétendre que la valeur du premier index est le plus petit
        et trouver la vrai valeur plus petite avec un boucle for et
        une condition.       
*/
import javax.swing.JOptionPane;
public class PlusPetit{
    public static void main(String[] args){
        String lecture;             //  Variable tampon de lecture
        int[] numTab = new int[10];
        int plusPetit;
        
        //  Lecture des 10 entiers
        for (int i = 0; i < numTab.length; i++){
            lecture = JOptionPane.showInputDialog("Entrez la valeur de l'index " + i + ":");
            numTab[i] = Integer.parseInt(lecture);
        }
        
        //  Prétendre que le plus petit entier est le premier
        plusPetit = numTab[0];
        //  Trouver le plus petit entier
        for (int i = 0; i < numTab.length; i++){
            //  Si un entier est plus petit que le premier entier du tableau
            if (numTab[i] < plusPetit){
                plusPetit = numTab[i];
            }
        }
        
        //  Affichage!
        JOptionPane.showMessageDialog(null, "Le plus petit nombre est : " + plusPetit);
    }
}
/*
  Par M. Chraiet
*/
