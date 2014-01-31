package sayalija.basics.volume;

public class Volume {

    private double value;
    private Unit unit;

    public Volume(double value, Unit unit) {

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    public Volume convertTo(Unit other) {
        double newValue = other.getRatio() / this.getUnit().getRatio() * this.getValue();
        return new Volume(newValue, other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume)) return false;

        Volume volume = (Volume) o;

        Volume otherUnit = volume.convertTo(Unit.LITER);
        Volume thisUnit = this.convertTo(Unit.LITER);

        return Double.compare(Math.round(thisUnit.getValue() * 100.0) / 100.0,
                Math.round(otherUnit.getValue() * 100.0) / 100.0) == 0;

    }
}
