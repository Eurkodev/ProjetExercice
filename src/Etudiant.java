import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {
    String nom;
    int age;
    int noteMoyenne;
    List<Object> listeEtudiants;

    public Etudiant(String nom, int age, int noteMoyenne) {
        this.nom = nom;
        this.age = age;
        this.noteMoyenne = noteMoyenne;
        listeEtudiants = new ArrayList<>();
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

    public void setAge(byte age) {
        this.age = age;
    }

    public void setNoteMoyenne(byte noteMoyenne) {
        this.noteMoyenne = noteMoyenne;

    }
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                '}';
    }



}
