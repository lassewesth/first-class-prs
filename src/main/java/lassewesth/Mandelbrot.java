package lassewesth;

class Mandelbrot {
    static boolean isIn(final double r, final double i) {
        double zr = 0, zi = 0;

        for (int j = 0; j < 100; j++) {
            double zr2 = zr * zr - zi * zi + r;
            double zi2 = 2 * zr * zi + i;

            if (sizeOf(zr2, zi2) > 2.0) return false;

            zr = zr2;
            zi = zi2;
        }

        return true;
    }

    private static double sizeOf(double r, double i) {
        return Math.sqrt(r * r - i * i);
    }
}
