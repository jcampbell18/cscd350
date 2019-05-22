import java.util.ArrayList;

public class CommandTester {
	
	private static String[] commands = { "create", "declare" };
	private static String[] components = { "rudder", "elevator", "aileron", "flap", "flap", "engine", "gear", "gear" };		
	private static double[] acceleration 	= { 0.0,   1.0,  2.0,  3.0,  4.0,  0.0, 0.0,  0.0, -1.0 };
	private static double[] angle 			= { 0.0,  30.0, 45.0, 60.0, 90.0,  0.0, 1.0, -1.0,  2.0, 3.0 };
	private static double[] speed 			= { 1.0,  10.1, 20.2, 30.3, 40.4, 50.5, 0.0,  1.00, 1.0 };
	private static ArrayList<String> tests = new ArrayList<String>();
	
	/*private static double[] percent = { 0.0, 10.0, 25.0, 50.0, 75.0, 100.0, 0.0, 10.0, 20.0, 0.0, 101.0 };
	private static String[] position = { "up", "1", "2", "3", "4", "3", "2", "1", "down" };
	private static double[] power = { 0.0, 10.0, 25.0, 50.0, 75.0, 100.0, 0.0, 10.0, 20.0, 0.0, 101.0 };
	private static int[] rate = { 1, 5, 10, 15, 20, 25, 20, 15, 0 };*/

	public static void main(String[] args) {
		
		TESTCREATIONALBuild();
		
		for (int ix = 0; ix < tests.size(); ix++) {
			
			System.out.println(tests.get(ix));
			
		}
		
		

	}// end main
	
	
	private static void TESTCREATIONALBuild() {
		
		buildCommands( TESTCREATIONALRudder(0) );
		buildCommands( TESTCREATIONALElevator(1) );
		buildCommands( TESTCREATIONALAileron(2) );
		buildCommands( TESTCREATIONALSplitFlap(3) );
		buildCommands( TESTCREATIONALFowlerFlap(4) );
		buildCommands( TESTCREATIONALEngine(5) );
		buildCommands( TESTCREATIONALNoseGear(6) );
		buildCommands( TESTCREATIONALMainGear(7) );

	}
	
	private static void buildCommands(ArrayList<String> toAdd) {
		
		for (int ix = 0; ix < toAdd.size(); ix++) {			
			tests.add(toAdd.get(ix));			
		}
		
	}
	
	
	private static ArrayList<String> TESTCREATIONALRudder(final int cx) {
			
		ArrayList<String> test = new ArrayList<String>();
		
		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + components[cx] + ix + " with limit " + angle[ix] + " speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
		
	}
	
	private static ArrayList<String> TESTCREATIONALElevator(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();
		
		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " " + components[cx] + ix + " with limit " + angle[ix] + " speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
		
	}
	
	private static ArrayList<String> TESTCREATIONALAileron(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();
		
		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " " + components[cx] + ix + " with limit up " + angle[ix] + " down " + angle[ix+1] + " speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
		
	}
	
	private static ArrayList<String> TESTCREATIONALSplitFlap(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();

		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " split " + components[cx] + ix + " with limit " + angle[ix] + " speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
	}
	
	private static ArrayList<String> TESTCREATIONALFowlerFlap(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();

		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " fowler " + components[cx] + ix + " with limit " + angle[ix] + " speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
	}
	
	private static ArrayList<String> TESTCREATIONALEngine(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();

		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " " + components[cx] + ix + " with speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
	}
	
	private static ArrayList<String>TESTCREATIONALNoseGear(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();

		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " " + components[cx] + ix + " with speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
	}
	
	private static ArrayList<String>TESTCREATIONALMainGear(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();

		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[0] + " " + components[cx] + " " + components[cx] + ix + " with speed " + speed[ix] + " acceleration " + acceleration[ix]); 
		}
		
		return test;
	}
	
	//Structual Commands
	//DECLARE RUDDER CONTROLLER <id1> WITH RUDDER <id2>
	//DECLARE ELEVATOR CONTROLLER <id1> WITH ELEVATORS <id2> <id3>
	//DECLARE AILERON CONTROLLER <id1> WITH AILERONS <idn>+ PRIMARY <idx> (SLAVE <idslave> TO <idmaster> BY <percent> PERCENT)*
	//DECLARE FLAP CONTROLLER <id> WITH FLAPS <idn>+
	//DECLARE ENGINE CONTROLLER <id1> WITH ENGINE[S] <idn>+
	//DECLARE GEAR CONTROLLER <id1> WITH GEAR NOSE <id2> MAIN <id3> <id4>
	//DECLARE BUS <id1> WITH CONTROLLER[S] <idn>+
	//COMMIT

	private static ArrayList<String>TESTSTRUCTURALRudder(final int cx) {
		
		ArrayList<String> test = new ArrayList<String>();

		for (int ix = 0; ix < speed.length; ix++) {
			test.add(commands[1] + " " + components[cx] + " " + components[cx] + ix + " with rudder " + acceleration[ix]); 
		}
		
		return test;
	}
	
	
	
	
	
	
	
}// end CreationalCommandTester class
