public abstract class Client extends Personne{
    private int Id_client;

    public int getId_client() {
        return Id_client;
    }

    public void setId_client(int id_client) {
        Id_client = id_client;
    }

    public Client(int Id_cleint, String Email, String MotDePasse, int DateNaissance, int Telephone, String Adresse){
        super(Email,MotDePasse,DateNaissance,Telephone,Adresse);
        this.Id_client = Id_cleint;
    }

    public void chercher() {
        System.out.println("Je suis Client");
    }
}
