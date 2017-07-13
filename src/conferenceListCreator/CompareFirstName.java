package conferenceListCreator;

import java.util.*;

/**
 * @author JOANNANO
 * Custom comparator to order First Name first and Last name second.
 *
 */
public class CompareFirstName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int c = p1.getName().compareTo(p2.getName());
		if (c == 0) return p1.getLastName().compareTo(p2.getLastName());
		else return c;
	}
	
}
