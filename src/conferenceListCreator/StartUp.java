package conferenceListCreator;

import java.util.*;



/**
 * Class containing main method for conference list program.
 * @author JOANNANO
 *
 */

public class StartUp {

	public static void main(String[] args)  {
		
		List<Person> people = null;
		try {
			people = IOFileManager.readFile();
		} catch (Exception e) {
			System.out.println("File could not be read.");
			System.exit(1);
		}
		Segregator segr = ConferenceListSelector.getSegregatorBasedOnUserInstruction(people);
		List<List<Person>> result = segr.createLists();
		Thing parameter = segr.getParameter();
        IOFileManager.writeFiles(result, parameter);
        ConsolePrinter.print(result, segr.getPrintingProperty());
        System.out.println("List(s) successfully created.");
	}

}
