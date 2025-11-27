import java.util.*;

public class Etudiant implements Comparable<Etudiant> {

    private String nom;
    private int age;
    private int noteMoyenne;
    List<Object> listEtudiants;

    public Etudiant(String nom, int age, int noteMoyenne) {
        this.nom = nom;
        this.age = age;
        this.noteMoyenne = noteMoyenne;
        listEtudiants = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }
    public int getAge() {
        return this.age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNoteMoyenne(int noteMoyenne) {
        this.noteMoyenne = noteMoyenne;

    }
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                '}';
    }


    public int getNoteMoyenne() {
        return this.noteMoyenne;
    }

    @Override
    public int compareTo(Etudiant etudiant) {
        return Integer.compare(etudiant.getNoteMoyenne(), this.getNoteMoyenne());
    }


}
