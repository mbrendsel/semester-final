import org.asl.karelx.Uberbot;

import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	// Provide one or more constructors, as you wish
	
	public Sentry(){
		super(4, 3, Display.NORTH, 0);
		
		
	}
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	
	public void patrol() {
		// TODO You implement this method.
		while(true){
			move();
			while(!nextToABeeper()){
				move();
			}
			if (nextToABeeper()){
				turnRight();
				
			}
		}
		
	}
}
