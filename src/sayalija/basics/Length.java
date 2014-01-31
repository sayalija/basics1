package sayalija.basics;

public class Length {
    private double value;
    private Unit unit;

    Length(double value,Unit unit){
        if(value < 0)
            throw new IllegalArgumentException();
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public Length convertTo(Unit other){
        double value =(this.getUnit().getUnitValue() / other.getUnitValue())
                * this.value;
        return new Length(value,other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;

        Length length = (Length) o;

        Length otherUnit = length.convertTo(Unit.METER);
        Length thisUnit = this.convertTo(Unit.METER);


        return Double.compare(Math.round(thisUnit.getValue()*100.0)/100.0,Math.round(otherUnit.getValue()*100.0)/100.0) == 0;
    }

}
