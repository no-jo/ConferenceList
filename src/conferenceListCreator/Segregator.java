package conferenceListCreator;

import java.util.List;

/**
 * Class determining the way of segregation of conference groups and related properties.
 * @author JOANNANO
 *
 */
public interface Segregator {

	
	/**
	 * Method creating separated lists of participants. 
	 * @return
	 * @throws NumberFormatException
	 * @throws UserInputException
	 */
	public abstract List<List<Person>> createLists() throws NumberFormatException, UserInputException;

	public abstract Thing getParameter();
	
	public abstract PrintingProperty getPrintingProperty();

	/**
	 * Method deciding which instance of segregator should be created based on user input.
	 * @param people
	 * @param selector
	 * @return
	 */
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
