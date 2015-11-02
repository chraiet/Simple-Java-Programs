/*
    Une classe Temperature qui demande quelle conversion effectuer et qui
    saisit ensuite la valeur de température à convertir et qui affiche le
    résultat.

    Entrées:
        choix       int
        Nombre à convertir      double

    Sorties:
        Nombre converti         double

    Traitements:
        Demander la conversion(celsius ou fahrenheit).
        Si la conersion demandée est en celsius, convertir le fahrenheit en celsius
        avec la méthode static celsius.
        Si la conersion demandée est en fahrenheit, convertir le celsius en fahrenheit
        avec la méthode static fahrenheit.
*/
import javax.swing.*;
public class Temperature {
    public static void main(String[] args){
        String lecture;     //  variable tampon de lecture
        int choix;          //  stocke le choix (conversion en celsius ou fahrenheit)
        double nombreConvertir;     //  nombre qui sera converti
        
        //  demander la conversion
        lecture = JOptionPane.showInputDialog("Choisir la conversion:\n"+
                "Entrez 1 pour convertir en celsius\n"+
                "Entrez 2 pour convertir en fahrenheit");
        choix = Integer.parseInt(lecture);
        
        //  s'il y a conversion vers celsius
        if (choix == 1){
            lecture = JOptionPane.showInputDialog("Entrez le fahrenheit à convertir");
            nombreConvertir = Integer.parseInt(lecture);
            JOptionPane.showMessageDialog(null, nombreConvertir + " fahrenheit équivaut à " + celsius(nombreConvertir) + " celsius.");
            //  s'il y a conversion vers fahrenheit
        } else if (choix == 2){            
            lecture = JOptionPane.showInputDialog("Entrez le celsius à convertir");
            nombreConvertir = Integer.parseInt(lecture);
            JOptionPane.showMessageDialog(null, nombreConvertir + " celsius équivaut à " + fahrenheit(nombreConvertir) + " fahrenheit.");
        }
    }
    
    //  méthode static qui convertit un fahrenheit en celsius
    public static double celsius(double fahr){
        return (5.0 / 9.0) * (fahr - 32);
    }
    
    //  méthode static qui convertit un celsius en fahrenheit
    public static double fahrenheit(double celsius){
        return (9.0 / 5.0) * celsius + 32;
    }
}
/*
    Par M. Chraiet
*/
