/**
 * Lab 10 Car class
 * @author Jacob Wills
 *
 */
public class Car extends Vehicle {
	
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePass) {
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePass;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPass() {
		return this.passengers;
	}
	
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.doors, super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		return getDoors() == otherCar.getDoors() && super.equals(other); 	
		
	}
	
	public Car copy() {
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlates = super.getPlate();
		int theDoors = this.doors;
		int thePass = this.passengers;
	
		Car carCopy = new Car(theMake, theModel, thePlates, theDoors, thePass);

		// return the copy of the Car.
		return carCopy;
	}

}
