package conferenceListCreator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FilterTest extends Filter {


	@Test
	public void RegularCase() {
		//given
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Marta,Andrut,1977-02-02"));
		people.add(new Person("Marta,Baban,1990-01-09"));
		people.add(new Person("Kamila,Bednarek,1999-07-02"));
		people.add(new Person("Marcin,Bednarek,1989-04-12"));
		people.add(new Person("Justyna,Kracz,1990-08-20"));
		people.add(new Person("Tomek,Momon,1980-12-22"));
		
		ArrayList<Person> expected = new ArrayList<Person>();
		expected.add(new Person("Marta,Baban,1990-01-09"));
		expected.add(new Person("Kamila,Bednarek,1999-07-02"));
		expected.add(new Person("Marcin,Bednarek,1989-04-12"));
		//when
		List<Person> result = Filter.selectByLastName(people, 'B');
		//then
		assertTrue(result.equals(expected));
	}

}
