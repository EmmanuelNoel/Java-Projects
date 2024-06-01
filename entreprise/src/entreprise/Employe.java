package entreprise;

abstract public class Employe {

    protected String nom;
    protected String prenom;



   public void Employe()
   {
  this.nom = "SOUWOUIN";
  this.prenom = "Emmanuel";
   }

    public void Employe(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }

//Accesseurs et mutateurs

     //nom

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //prenom

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


     //representation d'un employé

    public void tostring()
    {
        System.out.println("Nom : " + nom +" prenom : " + prenom);
    }

    //gain

    abstract public double gains();  //retourne le salaire



}
