package sbw.architecture.datatypes;

public class Percent {

	private double percent;
	
	public Percent(final double percent) {
		
		if (percent > 100.0 && percent < 0) {
			throw new RuntimeException("the percent value must be between (and including) 0 and 100");
		}// end precondition
		
		this.percent = percent;
		
	}// end constructor
	
}// end Percent class