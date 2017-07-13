package conferenceListCreator;

import java.util.List;

public class ConsolePrinter {

	static public void print(List<List<Person>> groups, Object selector) {
		if (groups.size() != 1) {
			return;
		} else {
			for (Person person : groups.get(0)) {
				System.out.println(person);
			}
		}
		System.out.println();
        System.out.println("List(s) successfully created.");
	};

}
