package conferenceListCreator;

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
