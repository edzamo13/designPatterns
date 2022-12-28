package amigoscode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle implements Shape{

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
