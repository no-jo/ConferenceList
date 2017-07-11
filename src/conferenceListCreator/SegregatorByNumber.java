package conferenceListCreator;

import java.util.List;

public class SegregatorByNumber implements Segregator {

	private List<Person> people;
	private int parameter;
	
	public SegregatorByNumber(List<Person> list, int param) {
		people = list;
		parameter = param;
	}

	@Override
	// TODO in case validation worked differently and number is not divider than this loop will not work
	public void createListsInFiles() {
		CompareLastName comp = new CompareLastName();
		Sorter.QuickSort(people, comp);
		for (int i = 0; i < people.size()-1; i = i + parameter){
			IOFileManager.writeFile(people.subList(i, i + parameter), "uczestnicy_" + Integer.toString(i) + ".csv");	
		}
	}

}
