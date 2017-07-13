package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Version of segregator prepared to print single list filtered by letter of lastName.
 * @author JOANNANO
 *
 */
public class SegregatorByName implements Segregator {

	private List<Person> people;
	private Letter parameter;
	private PrintingProperty print;

	/**
	 * Constructor setting required all properties.
	 * @param list
	 * @param c
	 */
	public SegregatorByName(List<Person> list, Character c) {
		people = list;
		parameter = new Letter(Character.toUpperCase(c));
		print = PrintingProperty.PRINTABLE;

	};

	/**
	 * @see conferenceListCreator.Segregator#createLists()
	 * Implementation creating single, filtered list by last name. Sorting by first name.
	 */
	@Override
	public List<List<Person>> createLists() {
		List<List<Person>> groups = new ArrayList<List<Person>>();
		;
		List<Person> filtered = Filter.selectByLastName(people, parameter.getValue());
		CompareFirstName comp = new CompareFirstName();
		Sorter.QuickSort(filtered, comp);
		groups.add(filtered);
		return groups;
	};

	public Letter getParameter() {
		return parameter;
	};

	public PrintingProperty getPrintingProperty() {
		return print;
	}

}
