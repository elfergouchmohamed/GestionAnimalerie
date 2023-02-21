import java.time.temporal.Temporal;

public class Employe extends Personne{
    int Id_employe;

    public int getId_employe() {
        return Id_employe;
    }

    public void setId_employe(int id_employe) {
        Id_employe = id_employe;
    }

    public Employe(int Id_employe, String Email, String MotDePasse, int DateNaissance,int telephone, String Adresse){
        super(Email,MotDePasse,DateNaissance,telephone,Adresse);
        this.Id_employe = Id_employe;
    }

    public void chercher(){
        System.out.println("je suis employee");
    }
}
