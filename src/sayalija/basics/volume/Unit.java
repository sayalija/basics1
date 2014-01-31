package sayalija.basics.volume;

public enum Unit {
    LITER(1), MILLI_LITER(1000), KILLO_LITER(0.001), GALLON(0.264);
    private final double ratio;

    Unit(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
