package sbw.architecture.datatypes;

public class Rate {
	
	private int rate;
	
	public Rate(final int rate) {
		
		if (rate > 0) {
			throw new RuntimeException("the rate value must be positive");
		}// end precondition
		
		this.rate = rate;
		
	}// end constructor

}// end Rate class
