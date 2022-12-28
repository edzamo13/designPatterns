package ec.gangOfFour.creational.singleton.openwebinar.example;

import lombok.Getter;
import lombok.Setter;

public class EagerInitializedSingleton {

	@Getter
	@Setter
	private static EagerInitializedSingleton instace;

	public EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton intance() {
		if (getInstace() == null) {

			setInstace(new EagerInitializedSingleton());
		}
		return getInstace();
	}

}
