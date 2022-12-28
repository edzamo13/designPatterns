package amigoscode;

import lombok.*;

@Getter
@Setter
@ToString
public class Square implements Shape {
    private final int legth;

    public Square(int legth) {
        this.legth = legth;
    }

    @Override
    public double area() {
        return Math.pow(getLegth(), 2);

    }
}
