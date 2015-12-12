import java.util.Date;
import javax.swing.JOptionPane;
public class Facture {
    private double montant;
    private Date date;
    private boolean incluTaxes;
    private String description;
    
    //  Constructeur sans paramètres
    public Facture(){
        this.montant = 0;
        date = new Date();
        incluTaxes = false;
    }
    //  Constructeur avec 2 paramètres
    public Facture(double montant, Date date, boolean incluTaxes, String description){
        this.montant = montant;
        this.date = new Date();
        this.incluTaxes = incluTaxes;
        this.description = description;
    }
    
    //  SETTERS
    public void setMontant(double montant){
        //  Vérifier que le montant est plus grand que 0
        if (montant > 0){
            this.montant = montant;
        } else {
            JOptionPane.showMessageDialog(null, "Erreur, le montant spécifié n'est pas plus grand que 0");
        }
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setIncluTaxes(boolean incluTaxes){
        this.incluTaxes = incluTaxes;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
    //  GETTERS
    public double getMontant(){
        return montant;
    }
    public Date getDate(){
        return date;
    }
    public boolean getIncluTaxes(){
        return incluTaxes;
    }
    public String getDescription(){
        return description;
    }
    public String toString(){
        return date.toString() + " - " + montant+"("+(incluTaxes ? "T" : "N")+") - " + description + "\n";
    }
}
/*
    Par M. Chraiet
*/
