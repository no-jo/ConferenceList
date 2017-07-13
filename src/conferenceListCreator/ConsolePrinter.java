package conferenceListCreator;

import java.util.List;

public class ConsolePrinter {

	static public void print(List<List<Person>> groups, Thing selector) {
		if (groups.size() != 1 || selector instanceof Number) { 
			//TODO get rid of instance of
			return;
		} else {
			for (Person person : groups.get(0)) {
				System.out.println(person);
			}
		}
		System.out.println();
	};

	// static public void print(List<List<Person>> groups, Number selector) {
	//
	// };
	//
	// static public void print(List<List<Person>> groups, Letter selector) {
	// for (List<Person> alist : groups) {
	// for (Person person : alist) {
	// System.out.println(person);
	// }
	// System.out.println();
	// }
	// };

}
