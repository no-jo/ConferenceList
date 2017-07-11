package conferenceListCreator;

import java.io.*;
import java.util.*;



public class StartUp {

	public static void main(String[] args) throws IOException {		
		List<Person> people = IOFileManager.readFile();
		Segregator segr = UIController.getSegregatorBasedOnUserInstruction(people);
        segr.createListsInFiles();      
        // FIXEM use writeFile method using list of lists
	}

}
