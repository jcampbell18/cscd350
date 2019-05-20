package sbw.architecture.datatypes;

public class Identifier {

	private String id;
	
	public Identifier(final String id) {
		
		if (id == null || id.isEmpty()) {
			throw new RuntimeException("id cannot be null or empty");
		}// end precondition
		
		this.id = id;
		
	}// end constructor
	
}// end Identifier class
