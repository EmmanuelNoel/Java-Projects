package entreprise;

public class TestEmploye {

    public static void main(String[] args) {

        String nom;
        String prenom;
        double salaire;
        double commission;
        double retribution;

        Employe[] employes = new Employe[3];

        nom="SOUWOUIN";
        prenom="Emmanuel";
        salaire=100.0;
        commission = 20000.0;
        retribution = 10000.0;

        employes[0] = new Patron(nom, prenom, salaire);
        employes[1] = new TravailleurCommission(nom, prenom, salaire, commission);
        employes[2] = new TravailleurHoraire(nom, prenom, retribution);

        TravailleurHoraire a = new TravailleurHoraire();
        a.setRetribution(retribution);
        a.tostring();

        for(Employe e : employes)
        {
            employes[0].tostring();
        }






    }




}
