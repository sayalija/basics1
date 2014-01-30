package sayalija.basics;

public class Length {
    double value;
    Unit unit;

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

    public double comparator(Length l1, Length l2){
        if(l1.getUnit() == l2.getUnit()){
            double value1 = l1.getValue();
            double value2 = l2.getValue();
            if(value1 == value2) return 0;
            else if (value1 )

        }

    }
}
