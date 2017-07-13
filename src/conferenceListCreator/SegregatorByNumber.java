package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Version of segregator prepared to print a few list with given number of participants. Sorted by lastName.
 * @author JOANNANO
 *
 */
public class SegregatorByNumber implements Segregator {

	private List<Person> people;
	private Number parameter;
	private PrintingProperty print;
	
	/**
	 * Constructor setting required all properties.
	 * @param list
	 * @param param
	 */
	public SegregatorByNumber(List<Person> list, Integer param) {
		people = list;
		parameter = new Number(param);
		print = PrintingProperty.NOTPRINTABLE;
	}

	/**
	 * @see conferenceListCreator.Segregator#createLists()
	 * Implementation creating a few lists by with given number of participants. Sorted by lastName.
	 */
	@Override
	// TODO in case validation worked differently and number is not divider than this loop will not work.
	// Possibility to rewrite to make it more universal for future use
	public List<List<Person>> createLists() {
		List<List<Person>> groups = new ArrayList<List<Person>>();
		CompareLastName comp = new CompareLastName();
		Sorter.QuickSort(people, comp);
		for (int i = 0; i < people.size()-1; i = i + parameter.getValue()){
			groups.add(people.subList(i, i + parameter.getValue()));	
		}
		return groups;
	}

	public Number getParameter() {
		return parameter;
	};
	
	public PrintingProperty getPrintingProperty() {
		return print;
	}
	
}
