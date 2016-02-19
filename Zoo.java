public class Zoo {
    private Animal[] animaux;
    private int nbAnimaux;
    private String ville;
    
    public Zoo()
    {
        this.nbAnimaux = 20;
        //  La dimension de ce tableau est fixée à 20 animaux
        this.animaux = new Animal[this.nbAnimaux];
        this.ville = "Inconnu";
    }
    
    public Zoo(String ville)
    {
        this.nbAnimaux = 20;
        this.animaux = new Animal[this.nbAnimaux];
        this.ville = ville;
    }
    
    public String endormirLesAnimaux()
    {
        String sommeil = "";
        for (int i = 0; i < animaux.length; i++)
        {
            //  Vérification des instances, c'est-à-dire de quel sous-classe est Animal et
            //  ainsi appeler les méthodes appropriées.
            if (animaux[i] instanceof Tigre)
                sommeil += ((Tigre)animaux[i]).getNom() + " = " + ((Tigre)animaux[i]).dormir() + "\n";
            else if (animaux[i] instanceof Lion)
                sommeil += ((Lion)animaux[i]).getNom() + " = " + ((Lion)animaux[i]).dormir() + "\n";
            else if (animaux[i] instanceof Ours)
                sommeil += ((Ours)animaux[i]).getNom() + " = " + ((Ours)animaux[i]).dormir() + "\n";
            else if (animaux[i] instanceof Zebre)
                sommeil += ((Zebre)animaux[i]).getNom() + " = " + ((Zebre)animaux[i]).dormir() + "\n";
        }        
        return sommeil;
    }
    
    public String faireCrier()
    {
        String crie = "";
        for (int i = 0; i < animaux.length; i++)
        {
            //  Vérification des sous-classes
            if (animaux[i] instanceof Tigre)
                crie += ((Tigre)animaux[i]).getNom() + " = " + ((Tigre)animaux[i]).exprimeToi() + "\n";
            else if (animaux[i] instanceof Lion)
                crie += ((Lion)animaux[i]).getNom() + " = " + ((Lion)animaux[i]).exprimeToi() + "\n";
            else if (animaux[i] instanceof Ours)
                crie += ((Ours)animaux[i]).getNom() + " = " + ((Ours)animaux[i]).exprimeToi() + "\n";
            else if (animaux[i] instanceof Zebre)
                crie += ((Zebre)animaux[i]).getNom() + " = " + ((Zebre)animaux[i]).exprimeToi() + "\n";
        }
        return crie;
    }
    
    public boolean ajouterAnimal(Animal animal)
    {
        for (int i = 0; i < animaux.length; i++)
        {
            //  Une place non occupée, donc ajout de l'animal
            if (animaux[i] == null)
            {
                animaux[i] = animal;
                nbAnimaux++;
                return true;
            }
        }
        //  Si il n'y a plus de places dans le Zoo
        return false;
    }
    
    public boolean deleteAnimal(String nom)
    {
        for (int i = 0; i < animaux.length; i++)
        {
            if (animaux[i].getNom().equalsIgnoreCase(nom))
                animaux[i] = null;
                nbAnimaux--;
                return true;
        }
        //  Si aucun animal avec ce nom a été trouvé
        return false;
    }
    
    public String getVille()
    {
        return ville;
    }
    
    public void setVille(String ville)
    {
        this.ville = ville;
    }
    
    public int getNbAnimaux()
    {
        return nbAnimaux;
    }
}
/*
    Par M. Chraiet
*/