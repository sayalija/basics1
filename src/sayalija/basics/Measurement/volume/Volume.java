package sayalija.basics.Measurement.volume;

import sayalija.basics.Measurement.Measurement;

public class Volume extends Measurement{


    protected Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    public Volume convertTo(VolumeUnit other){
        double value =(this.getUnit().getRatio() / other.getRatio())
                * this.value;
        return new Volume(value, other);
    }
}
