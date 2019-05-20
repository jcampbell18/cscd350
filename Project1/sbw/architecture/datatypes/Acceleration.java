package sbw.architecture.datatypes;

public class Acceleration {

	private double acceleration;
	
	public Acceleration(final double acceleration) {
		
		if (acceleration > Double.MAX_VALUE && acceleration < Double.MIN_VALUE) {
			throw new RuntimeException("the acceleration value cannot exceed its minimum or maximum container of Double");
		}// end precondition
		
		if (acceleration < 0) {
			throw new RuntimeException("the acceleration value cannot be less than zero");
		}// end precondition
		
		this.acceleration = acceleration;
		
	}// end constructor
	
}// end Acceleration class
