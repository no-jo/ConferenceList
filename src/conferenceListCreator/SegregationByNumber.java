package conferenceListCreator;

import java.util.List;

public class SegregationByNumber extends AbstractSegregator {

	private List<Person> people;
	private int parameter;
	
	public SegregationByNumber(List<Person> list, int param) {
		people = list;
		parameter = param;
	}

	@Override
	// in case validator worked differently and number is not modulo than this loop will not work ?  
	public void createListsInFiles() {
		CompareLastName comp = new CompareLastName();
		Sorter.QuickSort(people, comp);
		for (int i = 0; i < people.size()-1; i = i + parameter){
			IOFileManager.writeFile(people.subList(i, i + parameter -1), "uczestnicy_" + Integer.toString(i) + ".csv");	
		}
		UIController.displayEndMessage();

	}

}
