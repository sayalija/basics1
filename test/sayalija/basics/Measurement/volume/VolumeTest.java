package sayalija.basics.Measurement.volume;

import junit.framework.Assert;
import org.junit.Test;
import sayalija.basics.Measurement.Measurement;

import static org.junit.Assert.assertEquals;

public class VolumeTest {

    @Test
    public void testShouldCheckTwoLengthsAreEqual() {
        Volume volume1 = new Volume(6.4, VolumeUnit.LITER);
        Volume volume2 = new Volume(6.4, VolumeUnit.LITER);

        Assert.assertEquals(volume1, volume2);
    }

    @Test
    public void TwoLiterShouldEqualTo2000MilliLiter() {
        Volume volume = new Volume(2, VolumeUnit.LITER);
        Volume actual = volume.convertTo(VolumeUnit.MILLI_LITER);
        assertEquals(volume, actual);
    }

    @Test
    public void ThreeThousandMilliLiterShouldPoint003EqualToKiloLiter() {
        Volume volume = new Volume(3000, VolumeUnit.MILLI_LITER);
        Volume actual = volume.convertTo(VolumeUnit.KILLO_LITER);
        assertEquals(volume, actual);
    }

    @Test
    public void ThreeThousdsdfsandMilliLiterShouldPoint003EqualToKiloLiter() {
        Volume volume = new Volume(3000, VolumeUnit.MILLI_LITER);
        Volume actual = volume.convertTo(VolumeUnit.GALLON);
        assertEquals(volume, actual);
    }
}
