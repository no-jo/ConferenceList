package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;

public class SegregatorByNumber implements Segregator {

	private List<Person> people;
	private Number parameter;
	private PrintingProperty print;
	
	public SegregatorByNumber(List<Person> list, Integer param) {
		people = list;
		parameter = new Number(param);
		print = PrintingProperty.NOTPRINTABLE;
	}

	@Override
	// TODO in case validation worked differently and number is not divider than this loop will not work
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
	
	public PrintingProperty isPrintable() {
		return print;
	}
	
}
