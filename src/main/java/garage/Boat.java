package garage;

public class Boat extends Vehicle {
	public Boat() {
		this.setNoOfWheels(0);
		this.setNoOfEngines(2);
		this.setModelName("BoatyMcBoatFace");
		this.setColour("blue");
	}

	@Override
	public void move() {
		System.out.println("#Boat noise#");
	}

	public void sink() {
		System.out.println("Sinks :( ");
	}

	@Override
	public float calcBill() {
		return 99.99f;
	}
}