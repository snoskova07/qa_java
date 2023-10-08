import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterizedLionTest {

    private final String sex;
    private final boolean bool;
    public ParameterizedLionTest(String sex, boolean bool) {
        this.sex = sex;
        this.bool = bool;
    }

    @Parameterized.Parameters
    public static Object[][] getParams() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testGetParams() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(lion.doesHaveMane(), bool);
    }

}
