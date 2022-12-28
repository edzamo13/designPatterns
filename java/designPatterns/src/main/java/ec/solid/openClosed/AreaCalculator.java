package ec.com.openwebinar.solid.openClosed;

public class AreaCalculator {

	public double totalAreaBad(Object[] objects) {
		double area = 0;
		Rectangle rectangle = new Rectangle();
		// Circule circule = new Circule();

		for (Object object : objects) {

			if (object.equals(rectangle)) {
				area = ((Rectangle) object).getHeight() * ((Rectangle) object).getWight();
			} else {
				area = ((Circule) object).getRadius() * ((Circule) object).getRadius() * Math.PI;
			}

		}

		return area;
	}

	public double totalArea(Shape[] shapes) {
		double area = 0;

		for (Shape shape : shapes) {

			area += shape.area();
		}

		return area;
	}

}
