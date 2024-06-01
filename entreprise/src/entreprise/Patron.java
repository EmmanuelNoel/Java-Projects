package entreprise;

public class Patron extends Employe
{

    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }


    public void Patron()
    {

        this.salaire = 100.0;

    }

   /* public void Patron(String nom, String prenom, double salaire)
    {

    }*/

//Accesseurs et mutateurs

    //nom


    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    //prenom
    @Override
    public String getPrenom() {
        return super.getPrenom();
    }

    @Override
    public void setPrenom(String prenom) {
        super.setNom(prenom);
    }


    //salaire

    public double getSalaire() {
        return salaire;
    }

    public void setsalaire(double salaire) {
        this.salaire = salaire;
    }

    //representation d'un patron

    @Override
    public void tostring()
    {
       /* System.out.println("Nom : " + nom +" prenom : " + prenom+ "salaire : " + salaire);*/
      super.tostring();
        System.out.print( "salaire : " + salaire);
    }


    @Override
    public double gains()
    {
return this.getSalaire();
    }
}
