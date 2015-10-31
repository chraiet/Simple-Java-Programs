/*
    Un programme qui attribue la note de 1 à 10 à la qualité de la
    nourriture au cégep. Le programme doit compiler les réponses.

    Entrées:
        Notes           int

    Sorties:
        Nombre de participants  String
        Fréquences              int
     
    Traitements:
        Dans une boucle while, demander la note.
        Ajouter une incrémentation à la note(index) choisi grâce au
        tableau des notes.
        Si note vaut -1, quitter la boucle.
        Dans une boucle for, écrire les fréquences dans la variable ouput.
*/
import javax.swing.*;
public class Sondage {
    public static void main(String[] args){
        JTextArea textarea = new JTextArea();
        
        int note;                       //  note stocké temporairement dans la boucle while
        int participants = 0;               
        String lecture;                 //  Variable tampon de lecture
        int[] noteTab = new int[11];    //  Utiliser uniquement les index de 1 à 10
      
        //  Répéter toujours la boucle à moins que note vaut -1
        while (true){            
            lecture = JOptionPane.showInputDialog("Quel est votre note ? (1 à 10)\n"+
                    "Entrez -1 pour quitter.");
            note = Integer.parseInt(lecture);
            //  Si note vaut -1, quitter la boucle
            if (note == -1){
                break;
            } else{
                //  Ajouter à l'index(note) une incrémentation
                noteTab[note]++;
                participants++;
            }           
        }
        
        String output = "Nombre total de participants:\t" + participants + "\n";
        output += "_______________________\n";
        output += "Note\tFréquence\n";
        output += "_______________________\n";
        
        //  Écriture des fréquences dans output
        for (int iNote = 1; iNote < noteTab.length; iNote++){
            output += iNote + "\t" + noteTab[iNote] + "\n";
        }
        
        textarea.setText(output);
        
        JOptionPane.showMessageDialog(null, textarea, "Notes nourriture", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);       
    }
}
/*
    Par M. Chraiet
*/
