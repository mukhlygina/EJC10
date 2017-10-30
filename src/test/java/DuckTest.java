import homework3.Duck;
import homework3.MallardDuck;
import homework3.ToyDuck;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest {
    private Duck mallardDuck = new MallardDuck();
    private Duck toyDuck = new ToyDuck();

    @Test
    public void testMallardDuck() {
        assertEquals("Quack!", mallardDuck.performQuack());
        assertEquals("I am flying!", mallardDuck.performFly());
    }

    @Test
    public void testToyDuck() {
        assertEquals("Silence",toyDuck.performQuack());
        assertEquals("Can't fly", toyDuck.performFly());
    }
}
