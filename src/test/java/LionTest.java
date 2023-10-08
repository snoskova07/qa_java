import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;
import java.util.List;

public class LionTest {

    @Test
    public void testGetKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void testLion() {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("неСамец", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - Самец или Самка", exception.getMessage());
    }
}
