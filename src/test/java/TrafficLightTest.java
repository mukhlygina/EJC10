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
    public void testRed() {
        Light light = trafficLight.findLight(51);
        assertTrue(light == Light.RED);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testException() {
        trafficLight.findLight(-10);
    }
}
