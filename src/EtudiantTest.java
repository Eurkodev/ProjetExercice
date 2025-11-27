import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {
    // Fixtures : Mise en place des tests
    Etudiant tanjiro;

    @BeforeEach
    void setUp() {
        tanjiro = new Etudiant("Tanjiro", 15, 12);
    }

    @Test
        //Tests du constructeur de la classe Etudiant
    void testConstructeurEtudiant() {
        assertEquals("Tanjiro", tanjiro.getNom());
        assertEquals(15, tanjiro.getAge());
        assertNotEquals(12, tanjiro.getNoteMoyenne());
        assertNotNull(tanjiro.listEtudiants);
    }

    @Test
    void testObjetsIdentiques() {
        //Vérification d'objets-jumeaux
        Etudiant A = new Etudiant("A", 10, 12);
        Etudiant B = new Etudiant("B", 10, 11);
        Etudiant c = A;

        assertSame(A, c);
        assertNotSame(A, B);
    }

    @Test
    void testTri() {
        Etudiant fortiche = new Etudiant("Fortiche", 10, 18);
        Etudiant moyen = new Etudiant("Moyen", 13, 10);
        int resultat = fortiche.compareTo(moyen);
        assertTrue(resultat < 0);

    }

    @Test
    void testRapportComplet() {
        tanjiro.setNom("Zenitsu");
        tanjiro.setAge(16);
        tanjiro.setNoteMoyenne(13);
        // Vérification complète
        assertAll("Rapport complet de tests",
                () -> assertEquals("Zenitsu", tanjiro.getNom()),
                () -> assertEquals(12, tanjiro.getAge()),
                () -> assertEquals(13, tanjiro.getNoteMoyenne())

        );
    }

    @Test
    void testFormatage() {
        //Vérification du formatage
        assertEquals("Etudiant{" +
                "nom='" + tanjiro.getNom() + '\'' +
                '}', tanjiro.toString());
    }
}



