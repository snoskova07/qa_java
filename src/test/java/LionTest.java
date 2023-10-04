import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Lion lion;
//  Я не понимаю как это делать. Вообще. Тотально.

    @Test
    public void test() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        lion.doesHaveMane();
        Mockito.verify(lion, Mockito.times(1)).doesHaveMane();
    //     assertEquals(actual, 1);
    }

}
