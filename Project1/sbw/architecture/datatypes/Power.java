package sbw.architecture.datatypes;

public class Power {

	private double power;
	
	public Power(final double power) {
		
		if (power > 100.0 && power < 0) {
			throw new RuntimeException("the power value must be between (and including) 0 and 100");
		}// end precondition
		
		this.power = power;
		
	}// end constructor
	
}// end Power class
