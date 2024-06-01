package entreprise;

public class TravailleurCommission extends Employe{

    private double salaire;
    private double commission;
    private int quantite;


    public TravailleurCommission() {

    }


    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {

        super();
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.commission = commission;
    }

//Accesseurs et mutateurs

    //nom
    @Override
    public String getNom() {
        return super.getNom();
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

    public double getSalaire() {
        return salaire;
    }

    public void setsalaire(double salaire) {
        this.salaire = commission*quantite;
    }


    //commission

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }



    //Quantite

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    //representation d'un travailleur à la commission

    @Override
    public void tostring()
    {
        super.tostring();
        System.out.println("salaire : " + salaire+ "commission : " +commission);
    }


    @Override
    public double gains()
    {
        return this.getSalaire();
    }

}
