package sayalija.measurement;

public class Measurement {
    protected double value;
    protected Unit unit;
    protected Measurement(double value, Unit unit){
        this.value = value;
        this.unit = unit;
    }

    public double getValue(){
        return value;
    }

    public Unit getUnit(){
        return this.unit;
    }

    public Measurement convertTo(Unit other){
        double value =(this.getUnit().getRatio() / other.getRatio())
                * this.value;
        return new Measurement(value, other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;

        Measurement measurement = (Measurement) o;

        Measurement otherUnit = measurement.convertTo(this.getUnit());
        Measurement thisUnit = this.convertTo(this.getUnit());

        return Double.compare(Math.round(thisUnit.getValue()*100.0)/100.0,
                Math.round(otherUnit.getValue()*100.0)/100.0) == 0;
    }
}
