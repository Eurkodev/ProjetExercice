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
    void
    //



}