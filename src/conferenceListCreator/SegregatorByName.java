package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;

public class SegregatorByName implements Segregator {

	private List<Person> people;
	private Letter parameter;
	private PrintingProperty print;

	public SegregatorByName(List<Person> list, Character c) {
		people = list;
		parameter = new Letter(Character.toUpperCase(c));
		print = PrintingProperty.PRINTABLE;

	};

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

	public PrintingProperty isPrintable() {
		return print;
	}

}
