package conferenceListCreator;

import java.util.*;

/**
 * @author JOANNANO
 * Custom comparator to compare Last Name first and First Name second.
 */

public class CompareLastName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int c = p1.getLastName().compareTo(p2.getLastName());
		if (c == 0) return p1.getName().compareTo(p2.getName());
		else return c;
	}
	
}