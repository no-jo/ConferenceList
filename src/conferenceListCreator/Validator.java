package conferenceListCreator;

import java.util.List;
import java.util.regex.Pattern;

public class Validator {
	
	private List<Person> list;
	
	public Validator(List<Person> people) {
		list = people;
	}

	public boolean isValid(String input) {

		if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
			return true;
		} else if (Pattern.matches("[\\d]+", input)) {
			int k = Integer.parseInt(input);
			if (list.size()%k == 0) {
				return true;
			}
		}
		return false;
	}
}
