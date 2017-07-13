package conferenceListCreator;

import java.util.List;

public class ConsolePrinter {

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

//	 static public void print(List<List<Person>> groups, Number selector) {
//	
//	 };
//	
//	 static public void print(List<List<Person>> groups, Letter selector) {
//	 for (List<Person> alist : groups) {
//	 for (Person person : alist) {
//	 System.out.println(person);
//	 }
//	 System.out.println();
//	 }
//	 };

}
