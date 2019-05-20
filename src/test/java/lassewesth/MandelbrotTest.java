package lassewesth;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MandelbrotTest {
    @Test
    public void shouldComputePoints() throws Exception {
        assertThat(Mandelbrot.isIn(0.0, 0.0), is(true));

        assertFalse(Mandelbrot.isIn(2.0, 2.0));
    }
}
