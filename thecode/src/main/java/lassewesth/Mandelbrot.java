package lassewesth;

class Mandelbrot {
    static boolean contains(final double cr, final double ci) {
        double zr = 0, zi = 0;

        for (int j = 0; j < 100; j++) {
            double r = zr * zr - zi * zi + cr;
            double i = 2 * zr * zi + ci;

            if (abs(r, i) > 2.0) return false;

            zr = r;
            zi = i;
        }

        return true;
    }

    private static double abs(double r, double i) {
        return Math.sqrt(r * r - i * i);
    }
}
