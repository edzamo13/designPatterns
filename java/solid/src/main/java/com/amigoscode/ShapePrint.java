package amigoscode;


import java.util.List;

public class ShapePrint {

    private final IAreaCalculator areaCalculator;

    public ShapePrint(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    // Basic Single Responsibility
    public String json(List<Shape> shapes) {
        return String.format("{sum: %s}", areaCalculator.sum(shapes));
    }
}
