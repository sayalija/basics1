package sayalija.basics;

public class Square{
    Shape shape;
    public Square(double side){
        shape = Shape.createRectangle(side, side);
    }
    public double getArea(){
        return shape.getArea();
    }
    public double getPerimeter(){
        return shape.getPerimeter();
    }

}