package amigoscode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        ShapePrint print= new ShapePrint(areaCalculator);
        Circle circle = new Circle(10);
        Square square = new Square(10);
        //Liskov
        NoShape noShape= new NoShape();
        List<Shape> shapes = List.of(circle, square, new Cube(), new Rectangle());
        //int sum = areaCalculator.sum(shapes);
        System.out.println(print.json(shapes));
    }
}
