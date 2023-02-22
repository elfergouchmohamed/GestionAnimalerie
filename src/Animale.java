public abstract class Animale {
    private String Nom;
    private int Age;

    public String getNom() {
        return Nom;
    }

    public int getAge() {
        return Age;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setAge(int age) {
        Age = age;
    }

    public abstract void SeNourir();
}
