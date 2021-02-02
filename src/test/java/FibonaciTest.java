import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonaciTest {

    private final Fibonaci fib = new Fibonaci();
    @Test
    void exception () {
        Assertions.assertThrows(Exception.class, () -> fib.generate(0));
    }

    @Test
    void generateFirst()  {
        try {
            assertEquals (0, fib.generate(1));
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void generateSecond()  {
        try {
            assertEquals (1, fib.generate(2));
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void generateRandom()  {
        try {
            assertEquals (89, fib.generate(12));
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}