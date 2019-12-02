package garage;

public class Motorcycle extends Vehicle {
	public Motorcycle() {
		this.setNoOfWheels(2);
		this.setNoOfEngines(1);
		this.setModelName("BMW");
		this.setColour("green");
	}

	@Override
	public void move() {
		System.out.println("#Motorbike noises#");
	}

	@Override
	public float calcBill() {
		return 44.94f;
	}
}