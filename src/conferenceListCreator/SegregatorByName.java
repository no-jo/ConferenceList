package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;

public class SegregatorByName implements Segregator {

	private List<Person> people;
	private Object parameter;
	
	public SegregatorByName(List<Person> list, Character c) {
		people = list;
		parameter = Character.toUpperCase(c);
	};
	
	@Override
	public List<List<Person>> createLists() {
		List<List<Person>> groups = new ArrayList<List<Person>>();;
		List<Person> filtered = Filter.selectByLastName(people, (Character)parameter);
		CompareFirstName comp = new CompareFirstName();
		Sorter.QuickSort(filtered, comp);
		groups.add(filtered);
		return groups;
	};
	
	public Object getParameter() {
			return parameter;
		};
	}

