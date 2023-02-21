public class Client extends Personne{
    private int Id_client;

    public int getId_client() {
        return Id_client;
    }

    public void setId_client(int id_client) {
        Id_client = id_client;
    }

    public Client(int Id_cleint){
        this.Id_client = Id_cleint;
    }
}
