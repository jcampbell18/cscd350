package sbw.architecture.datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class Position {

	private String position;
	
	public Position(final String position) {
		
		if (position == null || position.isEmpty()) {
			throw new RuntimeException("The positions cannot be null or empty");
		}// end precondition
		
		ArrayList<String> options = new ArrayList<String>(Arrays.asList("up", "1", "2", "3", "4"));
		
		if (options.contains(position)) {
			
			this.position = position;
			
		} else {
			throw new RuntimeException("the position " + position + " is not recognized.  It must be up, 1, 2, 3 or 4");
		}
		
	}// end constructor
	
}// end Position class
