package conferenceListCreator;

import java.util.List;

public class SegregatorByName implements Segregator {

	private List<Person> people;
	private char parameter;
	
	public SegregatorByName(List<Person> list, char c) {
		people = list;
		parameter = Character.toUpperCase(c);
	};
	
	@Override
	public void createListsInFiles() {
		List<Person> result = Filter.selectByLastName(people, parameter);
		CompareFirstName comp = new CompareFirstName();
		Sorter.QuickSort(result, comp);
		IOFileManager.writeFile(result, "uczestnicy_" + parameter + ".csv");
	}

}
