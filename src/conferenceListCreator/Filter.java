package conferenceListCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	
	public static List<Person> selectByLastName(List<Person> people, char c) {
		List<Person> result = people.stream()
		        .filter(p -> p.getLastName().charAt(0) == c)
		        .map(person -> new Person(person))
		        .collect(Collectors.toCollection(ArrayList::new));
		return result;
	};

}
