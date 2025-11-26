import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BonjourTest {
@Test
    void testBonjour() {
    System.out.println("Thread courant : " + Thread.currentThread().getName());
    assertEquals(1, 1);
    }

}