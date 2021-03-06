package conferenceListCreator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JOANNANO
 * Class responsible for input and output of lists to and from files.
 */

public class IOFileManager {

	static final String PATH = "konferencja.csv";
	static final String WRITE_PATH = "uczestnicy_";

	/**
	 * Method to read list of objects Person to file.
	 * @return
	 * @throws IOException
	 */
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

	/**
	 * Method to write created lists to files.
	 * @param groups
	 * @param name_appendix
	 */
	static public void writeFiles(List<List<Person>> groups, Thing name_appendix) {

		int i = 1;
		for (List<Person> people : groups) {
			try {
				PrintWriter writer = new PrintWriter(
						WRITE_PATH + "_" + name_appendix.toString() + (i > 1 ? "_" + Integer.toString(i) : "") + ".csv",
						"UTF-8");

				for (Person p : people) {
					writer.printf("%s" + System.lineSeparator(), p);
				}
				writer.close();

			} catch (IOException e) {
				System.out.println("Nie można zapisać pliku");
			}
			i++;
		}

	}

}
