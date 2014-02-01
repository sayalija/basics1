package sayalija.basics.Measurement.length;

import sayalija.basics.Measurement.Unit;

public enum LengthUnit implements Unit{
    METER(1), CENTIMETER(0.01), MILLIMETER(0.001), KILOMETER(1000),
    INCH(1.0/39.370), YARD(1.0/1.09361), FEET(1.0/3.28084), MILES(1.0/0.000621371);

    private final double unitValue;

    LengthUnit(double relationWithMeter) {
        this.unitValue = relationWithMeter;
    }

    public double getRatio(){
        return unitValue;
    }
}
