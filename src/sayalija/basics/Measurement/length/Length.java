package sayalija.basics.Measurement.length;

import sayalija.basics.Measurement.Measurement;

public class Length extends Measurement {
    Length(double value, LengthUnit lengthUnit) {
        super(value, lengthUnit);
    }

    public Length convertTo(LengthUnit other){
        double value =(this.getUnit().getRatio() / other.getRatio())
                * this.value;
        return new Length(value, other);
    }
}
