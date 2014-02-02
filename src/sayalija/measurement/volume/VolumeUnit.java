package sayalija.measurement.volume;
import sayalija.measurement.Unit;

public enum VolumeUnit implements Unit{
    LITER(1), MILLI_LITER(0.001), KILLO_LITER(1000), GALLON(0.264);
    private final double ratio;

    VolumeUnit(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
