package sayalija.basics;

public class Square{
    Shapes shapes;
    public Square(double side){
        shapes = Shapes.createRectangle(side, side);
    }
    public double getArea(){
        return shapes.getArea();
    }
    public double getPerimeter(){
        return shapes.getPerimeter();
    }

}