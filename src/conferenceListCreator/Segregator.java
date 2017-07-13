package conferenceListCreator;

import java.util.List;

public interface Segregator {

	public abstract List<List<Person>> createLists() throws NumberFormatException, UserInputException;

	public abstract Thing getParameter();
	
	public abstract PrintingProperty isPrintable();

	public static Segregator createSegregator(List<Person> people, String selector) {
		if (Validator.isSingleLetter(selector)) {
			return new SegregatorByName(people, selector.charAt(0));
		} else if (Validator.isRepresentedAsPositiveInteger(selector)) {
			int k = 0;
			k = Integer.parseInt(selector); 
			//above throws NumberFormatException best would be to translate into business exception
			if (Validator.isInputListDivisor(people, k)) {
				return new SegregatorByNumber(people, k);
			}
		}
		throw new UserInputException();
		// return new SegregatorByNumber(people, 3);
	}
}
