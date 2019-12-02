package garage;

public class Car extends Vehicle {
	public Car() {
		this.setNoOfWheels(4);
		this.setNoOfEngines(1);
		this.setModelName("Astra");
		this.setColour("red");
	}

	@Override
	public void move() {
		System.out.println("#Car noise#");
	}

	@Override
	public float calcBill() {
		return 123;
	}
}