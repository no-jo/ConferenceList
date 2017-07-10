package conferenceListCreator;

import java.util.List;
import java.util.regex.Pattern;

public class ControlParameterValidator {
	
	private List<Person> list;
	private char c;
	private int i;
	
	public ControlParameterValidator(List<Person> people) {
		list = people;
	}

	public InputParameter isValid(String input) {

		if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
			c = input.charAt(0);
			return InputParameter.LETTER;
		} else if (Pattern.matches("[\\d]+", input)) {
			int k = Integer.parseInt(input);
			if (list.size()%k == 0) {
				i = k;
				return InputParameter.NUMBER;
			}
		}
		return InputParameter.INVALID;
	}
}
