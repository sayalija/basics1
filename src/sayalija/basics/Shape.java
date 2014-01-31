package sayalija.basics;

import java.awt.*;

public class Shape {
    private double length;
    private double breadth;

    private Shape(double length, double breadth) {
        if (length < 0 || breadth < 0)
            throw new IllegalArgumentException();
        this.length = length;
        this.breadth = breadth;
        Window.getWindows();
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public static Shape createRectangle(double length, double breadth) {
        return new Shape(length, breadth);
    }

    public static Shape createSquare(double length) {
        return new Shape(length, length);
    }
}
