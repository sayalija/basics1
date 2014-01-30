package sayalija.basics;

import java.awt.*;

public class Shapes {
    private double length;
    private double breadth;

    private Shapes(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
        Window.getWindows();
    }

    public double getArea(){
        return length * breadth;
    }

    public double getPerimeter(){
        return 2*(length + breadth);
    }

    public static Shapes createRectangle(double length, double breadth){
        return new Shapes(length,breadth);
    }

    public static Shapes createSquare(double length){
        return new Shapes(length,length);

    }
}
