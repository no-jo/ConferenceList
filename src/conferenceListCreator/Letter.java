package conferenceListCreator;

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
