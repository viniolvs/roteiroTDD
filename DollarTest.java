import org.junit.Test;
import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5, "USD");
        assertEquals(new Dollar(10, "USD"), five.times(2));
        assertEquals(new Dollar(15, "USD"), five.times(3));
    }
}