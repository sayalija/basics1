package sayalija.basics.volume;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void testGetUnit() {
        Volume volume = new Volume(2, Unit.MILLI_LITER);

        Assert.assertEquals(Unit.MILLI_LITER, volume.getUnit());
        Assert.assertEquals(2.0, volume.getValue());
    }

    @Test
    public void TwoLiterShouldEqualTo2000MilliLiter() {
        Volume volume = new Volume(2, Unit.LITER);
        Volume actual = volume.convertTo(Unit.MILLI_LITER);
        assertEquals(volume, actual);
    }

    @Test
    public void ThreeThousandMilliLiterShouldPoint003EqualToKiloLiter() {
        Volume volume = new Volume(3000, Unit.MILLI_LITER);
        Volume actual = volume.convertTo(Unit.KILLO_LITER);
        assertEquals(volume, actual);
    }

    @Test
    public void ThreeThousdsdfsandMilliLiterShouldPoint003EqualToKiloLiter() {
        Volume volume = new Volume(3000, Unit.MILLI_LITER);
        Volume actual = volume.convertTo(Unit.GALLON);
        assertEquals(volume, actual);
    }

}
