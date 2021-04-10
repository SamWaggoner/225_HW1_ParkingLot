// I collaborated with Andres Vargas, and looked at the zoom call during office hours.
// andres.e.vargas@maine.edu    I was helped by you, Chris Dufour during office hours.

public class ParkingTester {

	public static void main(String[] args) {
		// instiantiate parkinglot
		ParkingLot pl = new ParkingLot();
		// print the parking lot
		System.out.println(pl);
		// instantiate the Blue Lexus RX, handicapped
		Car Lexus = new Car("Lexus","RX","blue",true);
		// park the Lexus
		pl.Park(Lexus);
		// print the parking lot (call its ToString())
		System.out.println(pl);
		// instantiate a Ford Explorer SUV, non handicap
		Car Ford = new Car("Ford","Explorer", "black", false);
		// park the ford
		pl.Park(Ford);
		// print the parking lot
		System.out.println(pl);
		// remove the Lexus
		pl.Unpark(0);
		// print the parking lot
		System.out.println(pl);
	}
}
