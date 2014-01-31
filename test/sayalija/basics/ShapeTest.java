package sayalija.basics;

import junit.framework.Assert;
import org.junit.Test;

public class ShapeTest {
    @Test
    public void testGetArea() {
        Shape shape = Shape.createRectangle(4, 5);
        double expected = 4*5;
        double actual = shape.getArea();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetAreaForInteger() {
        Shape shape = Shape.createRectangle(2, 10);
        double expected = 2*10;
        double actual = shape.getArea();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToGetPerimeterOfRectangle() {
        Shape shape = Shape.createRectangle(5, 4);

        Assert.assertEquals(18.0, shape.getPerimeter());
    }

    @Test
    public void testToGetPerimeterOfSquare() {
        Shape rectangle = Shape.createRectangle(4, 5);

        Assert.assertEquals(16.0, rectangle.getPerimeter());
    }

    @Test
    public void testToGetAreaSquare() {
        Shape square = Shape.createSquare(4);

        Assert.assertEquals(16.0, square.getPerimeter());

    }

}
