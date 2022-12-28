package amigoscode;

public class NoShape implements Shape{

    //example Liskov
    @Override
    public double area() {
        throw new IllegalStateException( "Cannot calculate area ");
    }
}
