package ec.com.openwebinar.solid.openClosed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Circule implements Shape {

	private double radius;

	public double area() {

		return getRadius() * getRadius() * Math.PI;
	}

}
