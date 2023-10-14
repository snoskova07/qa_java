import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {

    private final String animalKind;
    private final List<String> food;

    public ParameterizedAnimalTest(String animalKind, List<String>  food) {
        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][] {
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(animal.getFood(animalKind), food);
     }
}