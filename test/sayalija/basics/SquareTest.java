package sayalija.basics;

import junit.framework.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testToGetAreaOfSquare() {
        Square square = new Square(4);
        Assert.assertEquals(16.0, square.getArea());
    }

    @Test
    public void testToGetPerimeterOfSquare() {
        Square square = new Square(5);
        Assert.assertEquals(20.0,square.getPerimeter());
    }
}
