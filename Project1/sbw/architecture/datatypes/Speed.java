package sbw.architecture.datatypes;

public class Speed {
	
	private double speed;
	
	public Speed(final double speed) {
		
		if (speed > 0) {
			throw new RuntimeException("the speed value must be positive");
		}// end precondition
		
		this.speed = speed;
		
	}// end constructor

}// end Speed class