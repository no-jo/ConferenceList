package conferenceListCreator;

/**
 * @author JOANNANO
 * Class wrapping integer to fit the segregator parameter hierarchy. 
 * Providing only simple constructor, getter and override to toString function.
 */

public class Number extends Thing {
	int i;
	
	public Number (int k) {
		i = k;
	}
	
	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
	public int getValue() {
		return i;
	}
}
