import java.util.SplittableRandom;

public abstract class Personne {

    //Declare les attributs de la classe personne
    private String Email;
    private String MotDePasse;
    private int DateNaissance;
    private int Telephone;
    private String Adresse;

    //Declare les getter de la classe personne


    public String getEmail() {
        return Email;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public int getDateNaissance() {
        return DateNaissance;
    }

    public int getTelephone() {
        return Telephone;
    }

    public String getAdresse() {
        return Adresse;
    }

    //Declare les setter de la classe personne


    public void setEmail(String email) {
        Email = email;
    }

    public void setMotDePasse(String motDePasse) {
        MotDePasse = motDePasse;
    }

    public void setDateNaissance(int dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }


    //initialiser le constructeur

    public Personne (String Email, String MotDePasse, int DateNaissance, int Telephone, String Adresse){
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.DateNaissance = DateNaissance;
        this.Telephone = Telephone;
        this.Adresse = Adresse;
    }

    //Declare la methode abstraite
    public abstract void chercher();

}

