package conferenceListCreator;

import java.util.List;

/**
 * @author JOANNANO
 * Class responsible for proper printout of messages or results to console.
 */

public class ConsolePrinter {

	/**
	 * Method responsible to print to console the created lists according to segregator selection.
	 * @param groups
	 * @param print
	 */
	static public void print(List<List<Person>> groups, PrintingProperty print) {
		if (print == PrintingProperty.NOTPRINTABLE) { 
			return;
		} 
		if (print == PrintingProperty.PRINTABLE) {
			for (Person person : groups.get(0)) {
				System.out.println(person);
			}
		}
		System.out.println();
	};

}
