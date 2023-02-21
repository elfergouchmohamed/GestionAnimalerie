public class Admin extends Personne {
    int Id_admin;

    public int getId_admin() {
        return Id_admin;
    }

    public void setId_admin(int id_admin) {
        Id_admin = id_admin;
    }

    public Admin (int Id_admin, String Email,String MotDePasse, int DateNaissance, int Telephone, String Adresse){
        super(Email,MotDePasse,DateNaissance,Telephone,Adresse);
        this.Id_admin = Id_admin;
    }

    public void chercher(){
        System.out.println("je suis admin");
    }
}
