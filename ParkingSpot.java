
public class ParkingSpot {
	public Car parkedCar; // refers to the class // public was not here before
	public boolean handicap;
	int a;
	int b;
	
	public ParkingSpot(int a){
		if (a < 5) {
			handicap = true;
		}
		if (a > 3) {
			handicap = false;
		}
	}
	
	public ParkingSpot(Car parkedCar, boolean handicap) {
		this.handicap = handicap;
		this.parkedCar = parkedCar;
	}
		
	@Override // taking an existing method that appears inside an object, and 
	public String toString() {
		return "ParkingSpot [parkedCar=" + parkedCar + ", handicap=" + handicap + "]";
	}
}

