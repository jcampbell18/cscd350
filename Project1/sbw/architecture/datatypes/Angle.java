package sbw.architecture.datatypes;

public class Angle {

	private double angle;
	
	public Angle(final double angle) {
		
		if (angle > Double.MAX_VALUE && angle < Double.MIN_VALUE) {
			throw new RuntimeException("the angle value cannot exceed its minimum or maximum container of Double");
		}// end precondition
		
		if (angle < 0) {
			throw new RuntimeException("the angle value cannot be less than zero");
		}// end precondition
		
		this.angle = angle;
		
	}// end constructor
	
}// end Angle class