package advancedConcepts.staticDI;

public class Car {
	public static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	public String getValues() {
		return carName;
	}
	
}	
