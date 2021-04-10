//Contains an array of twenty ParkingSpots, four of which must be handicap accessible.
//◦ Implements a constructor that creates the aforementioned array.
//◦ Implements a method that takes a Car and parks it in an appropriate available parking spot.
//This method should return an int representing the chosen index of the chosen parking spot in
//the array. This method should also return -1 if no parking spot is free.
//◦ Implements a method that takes an int and removes and returns the specified Car from the
//given Parking Spot.
//◦ Implement and override toString() to return a string containing the number of handicap
//accessible and standard parking spots available separated by a single space (NN NN)

public class ParkingLot {
	int parkingspotsh;
	int parkingspotsn;
	int x;
	int y;


	ParkingSpot[] spots = new ParkingSpot[20];

	public ParkingLot() {
		for (int i = 0; i < 20; i++) {
			spots[i] = new ParkingSpot(i);

		}
	}
	public int Park(Car c1) {
		for (int i = 0; i < 20; i++) {
			if (spots[i].parkedCar == null) {
				if (spots[i].handicap == c1.handicap) {
					spots[i].parkedCar = c1;
					return i;
				}
			}
		}
		return -1;

	}

	public Car Unpark(int x) {
		Car i = spots[x].parkedCar;
		spots[x].parkedCar = null;
		return i;
	}

	public ParkingSpot[] getSpots() {
		return spots;
	}
	public void makeHandicapped() {
		
	}

	@Override
	public String toString() {
		for (int i = 0; i <20; i++) {
			if (spots[i].handicap == true && spots[i].parkedCar == null)
				parkingspotsh ++;
			else if(spots[i].handicap == false && spots[i].parkedCar == null)
				parkingspotsn ++;
		}
		x = parkingspotsh;
		y = parkingspotsn;
		parkingspotsh = 0;
		parkingspotsn = 0;
		return (x + " " + y);
	}
	}




//public class ParkingLot {
//	ParkingSpot[] spots = new ParkingSpot[20];
//	
//	public ParkingLot() {
//		for (int i = 0; i < 20; i++) {
//			spots[i] = new ParkingSpot();
//			//UNfinished
//		}
//	}
//
//	// This is the getter
//	public ParkingSpot[] getSpots() {
//		return spots;
//	}
//
//	@Override
//	public String toString() {
//		return "ParkingLot with 20 spots";
//	}
//}