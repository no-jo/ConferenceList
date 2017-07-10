package conferenceListCreator;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Person implements Comparable<Person> {

	public Person(String s) {
		int pos = s.indexOf(",", 0);
		this.name = s.substring(0, pos);
		int pos2 = s.indexOf(",", pos + 1);
		this.lastName = s.substring(pos + 1, pos2);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.birthDate = LocalDate.parse(s.substring(pos2 + 1), format);
		Period per = Period.between(this.birthDate, LocalDate.now());
		this.age = per.getYears();
	}

	public Person(Person source) {
		this.name = source.name;
		this.lastName = source.lastName;
		this.birthDate = source.birthDate;
		this.age = source.age;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = birthDate.format(formatter);
		String person;
		person = name + "," + lastName + "," + formattedDate + "," + Integer.toString(age);
		return person;
	}

	@Override
	public int compareTo(Person p) {
		return (this.lastName.compareTo(p.lastName));
	}

	public boolean equals(Object source) {
		    if (this == source)
		        return true;
		    if (source == null)
		        return false;
		    if (getClass() != source.getClass())
		        return false;
		    Person person = (Person) source;

		if (this.name == person.name 
			&& this.lastName == person.lastName 
			&& this.birthDate == person.birthDate
			&& this.age == person.age)
			return true;
		else
			return false;
	}

	private String name;
	private String lastName;
	private LocalDate birthDate;
	private Integer age;

}
