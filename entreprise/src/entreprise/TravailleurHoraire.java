package entreprise;

public class TravailleurHoraire extends  Employe {

    private double retribution;
    private  double heures;

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super();

        this.nom = nom;
        this.prenom = prenom;
        this.retribution = retribution;
    }

    public TravailleurHoraire() {
        this.heures = 50;
        this.retribution = 10000.0;
    }





//Accesseurs et mutateurs

    //nom
    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //prenom
    @Override
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    //salaire

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {


        this.retribution = retribution * heures;
    }

    //heures

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }





    //representation d'un patron
    @Override
    public void tostring()
    {
         super.tostring();
        System.out.println( "Retribution : " + retribution+ "Salaire : "+getRetribution());
    }


    @Override
    public double gains()
    {
        return getRetribution();
    }

}
