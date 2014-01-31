package sayalija.basics.length;

import junit.framework.Assert;
import org.junit.Test;

public class LengthTest {
    @Test
    public void testGetUnit() {
        Length length = new Length(2, Unit.CENTIMETER);

        Assert.assertEquals(Unit.CENTIMETER, length.getUnit());
        Assert.assertEquals(2.0, length.getValue());
    }

    @Test
    public void testGetValue() {
        Length length = new Length(2, Unit.METER);

        Assert.assertEquals(Unit.METER, length.getUnit());
        Assert.assertEquals(2.0, length.getValue());
    }

    @Test
    public void testConvertsCentiMeterToMeter() {
        Length length = new Length(6.4, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.METER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testGetLengthInMilliMeterOfCentiMeter() {
        Length length = new Length(6.4, Unit.METER);
        Length actual = length.convertTo(Unit.MILLIMETER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfCentiMeterAndMeter() {
        Length length = new Length(6.4, Unit.CENTIMETER);
        Length actual = length.convertTo(Unit.METER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfKilometerAndMeter() {
        Length length = new Length(6.4, Unit.KILOMETER);
        Length actual = length.convertTo(Unit.METER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfInchAndMeter() {
        Length length = new Length(1, Unit.METER);
        Length actual = length.convertTo(Unit.INCH);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfMeterToYard() {
        Length length = new Length(3.3, Unit.YARD);
        Length actual = length.convertTo(Unit.INCH);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfMeterToFeet() {
        Length length = new Length(3.3, Unit.METER);
        Length actual = length.convertTo(Unit.FEET);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfKiloMeterToMiles() {
        Length length = new Length(3.3, Unit.MILES);
        Length actual = length.convertTo(Unit.METER);

        Assert.assertEquals(length, actual);
    }
}
