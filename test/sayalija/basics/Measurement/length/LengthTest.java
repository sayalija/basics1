package sayalija.basics.Measurement.length;

import junit.framework.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void testShouldCheckTwoLengthsAreEqual() {
        Length length1 = new Length(6.4, LengthUnit.CENTIMETER);
        Length length2 = new Length(6.4, LengthUnit.CENTIMETER);

        Assert.assertEquals(length1, length2);
    }

    @Test
    public void testConvertsCentimeterToMeter() {
        Length length = new Length(6.4, LengthUnit.CENTIMETER);
        Length actual = length.convertTo(LengthUnit.CENTIMETER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testGetLengthInMilliMeterOfCentiMeter() {
        Length length = new Length(6.4, LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.MILLIMETER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfCentiMeterAndMeter() {
        Length length = new Length(6.4, LengthUnit.CENTIMETER);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfKilometerAndMeter() {
        Length length = new Length(6.4, LengthUnit.KILOMETER);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfInchAndMeter() {
        Length length = new Length(1, LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.INCH);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfMeterToYard() {
        Length length = new Length(3.3, LengthUnit.YARD);
        Length actual = length.convertTo(LengthUnit.INCH);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfMeterToFeet() {
        Length length = new Length(3.3, LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.FEET);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfKiloMeterToMiles() {
        Length length = new Length(3.3, LengthUnit.MILES);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(length, actual);
    }
}
