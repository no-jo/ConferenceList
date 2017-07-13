package conferenceListCreator;

import java.util.List;
import java.util.regex.Pattern;


/**
 * @author JOANNANO
 * Set of method checking particular conditions.
 */

public class Validator {
	
	/**
	 * Method checking if list can be divided into even parts with given number of participants.
	 * @param people
	 * @param k
	 * @return
	 */
	public static boolean isInputListDivisor(List<Person> people, int k) {
		return (k != 0 && people.size()%k == 0);
	}

	/**
	 * Method checking if user provided an integer number (no negative sign, no floating point allowed).
	 * @param control
	 * @return
	 */
	public static boolean isRepresentedAsPositiveInteger(String control) {
		return Pattern.matches("[\\d]+", control);
	}

	/**
	 * Method to check if string is actually only one letter.
	 * @param control
	 * @return
	 */
	public static boolean isSingleLetter(String control) {
		return control.length() == 1 && Character.isLetter(control.charAt(0));
	}
}
