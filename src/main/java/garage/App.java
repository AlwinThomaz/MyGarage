package garage;

public class App {
	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.add(new Car());
		garage.add(new Boat());
		garage.add(new Motorcycle());
		garage.add(new Car());
		garage.add(new Plane());
		garage.add(new Bike());
		garage.remove(new Bike());

		System.out.println(garage.calcTotalBill());
	}
}