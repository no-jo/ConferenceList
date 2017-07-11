package conferenceListCreator;

import java.util.List;
import java.util.regex.Pattern;

//FIXME could use abstract validator NOTE: can be see as ravioli pasta code
public class Validator {
	
	public static boolean isInputListDivisor(List<Person> people, int k) {
		return (k != 0 && people.size()%k == 0);
	}

	public static boolean isRepresentedAsPositiveInteger(String control) {
		return Pattern.matches("[\\d]+", control);
	}

	public static boolean isSingleLetter(String control) {
		return control.length() == 1 && Character.isLetter(control.charAt(0));
	}
}
