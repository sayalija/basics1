package sayalija.measurement.length;

import sayalija.measurement.Measurement;

public class Length extends Measurement {
    Length(double value, LengthUnit lengthUnit) {
        super(value, lengthUnit);
    }

    public Length convertTo(LengthUnit other){
        Measurement measurement = super.convertTo(other);
        return new Length(measurement.getValue(),(LengthUnit)measurement.getUnit());
    }
}
