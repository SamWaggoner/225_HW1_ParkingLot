public class Car {
	String make;
	String model;
	String color;
	boolean handicap;
			
	public Car() {
		make = "Ford";
		model = "F150";
		color = "Red";
		handicap = false;
	}
	
	public Car(String make, String model, String color, boolean handicap) {
		//paramaterized constructor
		this.make = make;
		this.model = model;
		this.color = color;
		this.handicap = handicap;	
	}
}
