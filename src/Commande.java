import java.util.Date;

public class Commande {
    private int Ref_commande;
    private Date Date_commande;

    public int getRef_commande() {
        return Ref_commande;
    }

    public Date getDate_commande() {
        return Date_commande;
    }

    public void setRef_commande(int ref_commande) {
        Ref_commande = ref_commande;
    }

    public void setDate_commande(Date date_commande) {
        Date_commande = date_commande;
    }

    public Commande (int Ref_commande, Date Date_commande){
        this.Ref_commande = Ref_commande;
        this.Date_commande = Date_commande;
    }
}
