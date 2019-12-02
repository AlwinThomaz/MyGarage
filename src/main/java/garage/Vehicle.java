package garage;

public abstract class Vehicle {
	private int noOfWheels;
	private int noOfEngines;
	private String colour;
	private String modelName;

	public abstract void move();

	public void noise() {
		System.out.println("Vroom!");
	}

	public abstract float calcBill();

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfEngines() {
		return noOfEngines;
	}

	public void setNoOfEngines(int noOfEngines) {
		this.noOfEngines = noOfEngines;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	// @Override
	// public String toString() {
	// return "Vehicle [noOfWheels=" + noOfWheels + ", noOfEngines=" + noOfEngines +
	// ", colour=" + colour
	// + ", modelName=" + modelName + "]";
}