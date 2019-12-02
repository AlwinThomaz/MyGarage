package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicle> garage = new ArrayList<Vehicle>();

	public boolean add(Vehicle vehicle) {
		return this.garage.add(vehicle);
	}

	public boolean remove(Vehicle vehicle) {
		return this.garage.remove(vehicle);
	}

	public float calcTotalBill() {
		float bill = 0;
		for (Vehicle v : garage) {
			bill += v.calcBill();
		}
		return bill;
	}

}
