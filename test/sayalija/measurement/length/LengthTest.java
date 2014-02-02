package sayalija.measurement.length;

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
        Length expected = new Length(6.4,LengthUnit.CENTIMETER);
        Length actual = length.convertTo(LengthUnit.CENTIMETER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLengthInMilliMeterOfCentiMeter() {
        Length length = new Length(6.4, LengthUnit.METER);
        Length expected = new Length(6400,LengthUnit.MILLIMETER);
        Length actual = length.convertTo(LengthUnit.MILLIMETER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfCentiMeterAndMeter() {
        Length length = new Length(6.4, LengthUnit.CENTIMETER);
        Length expected = new Length(0.064,LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfKilometerAndMeter() {
        Length length = new Length(6.4, LengthUnit.KILOMETER);
        Length expected = new Length(6400,LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfInchAndMeter() {
        Length length = new Length(1, LengthUnit.METER);
        Length expected = new Length(39.3701,LengthUnit.INCH);
        Length actual = length.convertTo(LengthUnit.INCH);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfMeterToYard() {
        Length length = new Length(3.3, LengthUnit.YARD);
        Length expected = new Length(118.8,LengthUnit.INCH);
        Length actual = length.convertTo(LengthUnit.INCH);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfMeterToFeet() {
        Length length = new Length(3.3, LengthUnit.METER);
        Length expected = new Length(10.8268,LengthUnit.FEET);
        Length actual = length.convertTo(LengthUnit.FEET);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfKiloMeterToMiles() {
        Length length = new Length(3.3, LengthUnit.MILES);
        Length expected = new Length(5310.84,LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }
}
