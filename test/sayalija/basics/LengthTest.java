package sayalija.basics;

import junit.framework.Assert;
import org.junit.Test;

public class LengthTest {
    @Test
    public void testGetUnit() {
        Length l = new Length(2, Unit.CentiMeter);
        Assert.assertEquals(Unit.CentiMeter,l.getUnit());
    }

    @Test
    public void testGetValue() {
        Length l = new Length(2, Unit.Meter);
        Assert.assertEquals(2.0,l.getValue());
    }
}
