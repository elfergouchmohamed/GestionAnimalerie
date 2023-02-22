public class Produit {
    private int Ref_produit;
    private String Description;
    private String Libelle;
    private double Prix;
    private Commande[] commnde;

    public int getRef_produit() {
        return Ref_produit;
    }

    public String getDescription() {
        return Description;
    }

    public String getLibelle() {
        return Libelle;
    }

    public double getPrix() {
        return Prix;
    }

    public void setRef_produit(int ref_produit) {
        Ref_produit = ref_produit;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public Produit(int Ref_produit, String Description, String Libelle, double Prix){
        this.Ref_produit = Ref_produit;
        this.Description = Description;
        this.Libelle = Libelle;
        this.Prix = Prix;
    }

    public Commande[] getCommnde(){
        return this.commnde;
    }
}
