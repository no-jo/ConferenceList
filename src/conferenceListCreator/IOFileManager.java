package conferenceListCreator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class IOFileManager {

	static final String PATH = "konferencja.csv";

	static public List<Person> readFile() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(PATH)));
		String line;
		List<Person> people = new ArrayList<Person>();

		while (true) {
			line = reader.readLine();
			if (line == null) {
				break;
			} else {
				people.add(new Person(line));
			}
		}
		reader.close();
		return people;
	}

	static public void writeFile(List<Person> people, String filename) {
		try {
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			
			for (Person p : people) {
	        	writer.printf("%s" + System.lineSeparator(), p);
			}			
			writer.close();
			
		} catch (IOException e) {
			System.out.println("Nie można zapisać pliku");
		}

	}

}
