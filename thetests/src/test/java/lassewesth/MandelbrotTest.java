package lassewesth;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MandelbrotTest {
    @Test
    public void shouldComputePoints() {
        assertTrue(Mandelbrot.contains(0.0, 0.0));
        assertFalse(Mandelbrot.contains(2.0, 2.0));
    }
}
