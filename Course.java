public class Course {
    private int dureeCourse;
    private Coureur[] coureursTab;
    
    //  Constructeur sans paramètres
    public Course()
    {
        //  Par défaut, la durée de la course est de 100 unités
        this.dureeCourse = 100;
        //  Par défaut, 2 coureurs
        this.coureursTab = new Coureur[2];
        //  Attribuer la valeur null à tous les coureurs
        for (int i = 0; i < coureursTab.length; i++)
        {
            coureursTab[i] = null;
        }
    }
    //  Constructeur avec paramètres
    public Course(int dureeCourse, Coureur[] coureurs)
    {
        this.dureeCourse = dureeCourse;
        this.coureursTab = coureurs;
    }
    
    public void faireCourir()
    {
        //  Chaque coureur doit courir un nombre de pas entre 1 et 6 inclus
        for (int i = 0; i < coureursTab.length; i++)
        {
            coureursTab[i].courir(Course.lancerDe());
        }
    }
    
    public String dessinerCourse()
    {
        String course = "";
        for (int i = 0; i < coureursTab.length; i++)
        {
            course += "\n" + coureursTab[i].getNom() + "\n" +
                    coureursTab[i].dessinerCoureur(dureeCourse);
        }
        return course;
    }
    
    public static int lancerDe()
    {
        //  Nombre aléatoire entre 1 et 6 inclus
        return 1 + (int)(Math.random() * 6);
    }
    
    public Coureur[] quiGagne()
    {
        //  Allouer 5 places au tableau, car il peut y avoir plus qu'un
        //  gagnant
        Coureur[] gagnants = new Coureur[5];
        for (int i = 0; i < coureursTab.length; i++)
        {
            //  Dès qu'un coureur arrive à la ligne d'arrivée ou la dépasse
            if (coureursTab[i].getPosition() >= dureeCourse)
                gagnants[i] = coureursTab[i];
        }        
        //  Vérifier si il y a des vainqueurs
        for (int i = 0; i < gagnants.length; i++)
        {
            //  Si il y au moins un vainqeur
            if (gagnants[i] != null)
                return gagnants;
        }
        //  Si aucun gagnant retourné
        return null;
    }
    //  Setters
    public void setDureeCourse(int duree)
    {
        dureeCourse = duree;
    }
    public void setCoureurs(Coureur[] coureurs)
    {
        this.coureursTab = coureurs;
    }
    //  Getters
    public int getDureeCourse()
    {
        return dureeCourse;
    }
    public Coureur[] getCoureurs()
    {
        return coureursTab;
    }
}
/*
    Par M. Chraiet
*/
