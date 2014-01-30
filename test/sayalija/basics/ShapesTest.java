package sayalija.basics;

import junit.framework.Assert;
import org.junit.Test;

public class ShapesTest {
    @Test
    public void testGetArea() {
        Shapes shapes = Shapes.createRectangle(4, 5);
        double expected = 4*5;
        double actual = shapes.getArea();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetAreaForInteger() {
        Shapes shapes = Shapes.createRectangle(2, 10);
        double expected = 2*10;
        double actual = shapes.getArea();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToGetPerimeterOfRectangle() {
        Shapes shapes = Shapes.createRectangle(5, 4);

        Assert.assertEquals(18.0, shapes.getPerimeter());
    }

    @Test
    public void testToGetPerimeterOfSquare() {
        Shapes shapes = Shapes.createRectangle(4, 4);

        Assert.assertEquals(16.0, shapes.getPerimeter());
    }

    @Test
    public void testToGetAreaSquare() {
        Shapes shapes = Shapes.createSquare(4);
        Assert.assertEquals(16.0, shapes.getPerimeter());
    }

}
