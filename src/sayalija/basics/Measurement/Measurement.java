package sayalija.basics.Measurement;

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

        Measurement length = (Measurement) o;

        Measurement otherUnit = length.convertTo(this.getDefault());
        Measurement thisUnit = this.convertTo(this.getDefault());

        return Double.compare(Math.round(thisUnit.getValue()*100.0)/100.0,
                Math.round(otherUnit.getValue()*100.0)/100.0) == 0;
    }

    Unit getDefault(){
        return this.getUnit();
    }
}
