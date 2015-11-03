/*
    Un programme qui demande une lettre de l'alphabet et qui affiche
    le code morse correspondant.

    Entrées:
        lettre          char
    Sortie:
        morse           String

    Traitements:
        Demander la lettre avec un JOptionPane et prendre la première
        lettre avec la méthode charAt(0).
        Déterminer l'index de la lettre choisie avec une boucle for.
        Utiliser l'index de la lettre trouvé pour afficher l'équivalent
        en morse.
*/
import javax.swing.*;
public class Morse {
    public static void main(String[] args){
        String lecture;     //  variable tampon de lecture
        char lettre;        //  pour stocker la lettre à convertir en morse
        int lettreIndex = 0;    //  stocker l'index de la lettre
        char[] lettres = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
        'r','s','t','u','v','w','x','y','z'};
        String[] morse = {".  _","_  .  .  .","_  .  _  .","_  .  .",".",".  .  _  .","_  _  .",".  .  .  .",".  .",".  _  _  _","_  .  _",".  _  .  .",
        "_  _","_  .","_  _  _",".  _  _  .","_  _  .  _",".  _  .",".  .  ."," _ ",".  .  _",".  .  .  _",".  _  _","_  .  .  _","_  .  _  _","_  _  .  ."};
        
        lecture = JOptionPane.showInputDialog("Choisir une lettre de l'alphabet");
        lettre = lecture.charAt(0);     //  prendre la première lettre du String
        
        //  déterminer l'index de la lettre choisie
        for (int i = 0; i < lettres.length; i++){
            if (lettres[i] == lettre){
                lettreIndex = i;
            }
        }
        
        //  utiliser l'index de la lettre pour afficher l'équivalent en morse
        JOptionPane.showMessageDialog(null, "L'équivalent en morse de la lettre " + lettre + " est:\n" + morse[lettreIndex]);
    }
}
/*
    Par M. Chraiet
*/
