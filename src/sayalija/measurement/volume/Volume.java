package sayalija.measurement.volume;

import sayalija.measurement.Measurement;

public class Volume extends Measurement{


    protected Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    public Volume convertTo(VolumeUnit other){
        Measurement measurement = super.convertTo(other);
        return new Volume(measurement.getValue(),(VolumeUnit)measurement.getUnit());
    }
}
