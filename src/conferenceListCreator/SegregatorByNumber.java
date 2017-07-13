package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;

public class SegregatorByNumber implements Segregator {

	private List<Person> people;
	private Object parameter;
	
	public SegregatorByNumber(List<Person> list, Integer param) {
		people = list;
		parameter = param;
	}

	@Override
	// TODO in case validation worked differently and number is not divider than this loop will not work
	public List<List<Person>> createLists() {
		List<List<Person>> groups = new ArrayList<List<Person>>();
		CompareLastName comp = new CompareLastName();
		Sorter.QuickSort(people, comp);
		for (int i = 0; i < people.size()-1; i = i + (Integer)parameter){
			groups.add(people.subList(i, i + (Integer)parameter));	
		}
		return groups;
	}

	public Object getParameter() {
		return parameter;
	};
	
}
