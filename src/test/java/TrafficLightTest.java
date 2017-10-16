import org.junit.Test;
import ru.mukhlygina.Light;
import ru.mukhlygina.TrafficLight;

import static org.junit.Assert.assertTrue;

/**
 * @author Marina Mukhlygina
 */
public class TrafficLightTest {
    private TrafficLight trafficLight = new TrafficLight();

    @Test
    public void testYellow() {
        Light light = trafficLight.findLight(53);
        assertTrue(light == Light.YELLOW);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testException() {
        trafficLight.findLight(-10);
    }

    @Test
    public void testRed() {
        Light light = trafficLight.findLight(0);
        assertTrue(light == Light.RED);
    }

    @Test
    public void testGreen() {
        Light light = trafficLight.findLight(129);
        assertTrue(light == Light.GREEN);
    }
}
