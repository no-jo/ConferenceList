package conferenceListCreator;

/**
 * @author JOANNANO
 * Class wrapping char to fit the segregator parameter hierarchy. 
 * Providing only simple constructor, getter and override to toString function.
 */

public class Letter extends Thing {
	char a;
	
	public Letter(char s){
		a = s;
	}
	
	@Override
	public String toString() {
		return Character.toString(a);
	}
	
	public char getValue() {
		return a;
	}
}
