package conferenceListCreator;

import java.util.List;
import java.util.Scanner;

/**
 * @author JOANNANO
 * Class responsible for defining further flow of the program by creation of a segragator.
 */

public class ConferenceListSelector {

	/**
	 * @author JOANNANO
	 * Method responsible for getting user input defining further flow of the program by creation of a segragator.
	 */	
	public static Segregator getSegregatorBasedOnUserInstruction(List<Person> people) {

		Scanner scan = new Scanner(System.in);
		String selector;
		Segregator segr = null;

		System.out.println("Provide parameter for segregation");
		boolean shouldCont = false;
		do {
			shouldCont = false;
			selector = scan.nextLine();
			try {
				segr = Segregator.createSegregator(people, selector);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Provide correct parameter for segregation");
				shouldCont = true;
			}
		} while (shouldCont);

		scan.close();
		return segr;
	}
}
