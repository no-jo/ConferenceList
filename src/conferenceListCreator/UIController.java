package conferenceListCreator;

import java.util.List;
import java.util.Scanner;

public class UIController {

	//FIXME what about constructor with "people" and getting rid of static method
	public static Segregator getSegregatorBasedOnUserInstruction(List<Person> people) {

		Scanner scan = new Scanner(System.in);
		String control;
		Segregator segr;

		System.out.println("Provide parameter for segregation");

		// FIXME maybe it's a good idea to change while statement to practical one
		while (true) {
			control = scan.nextLine();
			if (Validator.isSingleLetter(control)) {
				// FIXME consider using factory method in factory class
				segr = new SegregatorByName(people, control.charAt(0));
				break;
			} else if (Validator.isRepresentedAsPositiveInteger(control)) {
				int k = 0;
				try {
					k = Integer.parseInt(control);
				} catch (Exception e) {
					System.out.println("Provided number is too big.");
					System.out.println("Provide correct parameter for segregation");
				}
				if (Validator.isInputListDivisor(people, k)) {
					// FIXME consider using factory method in factory class
					segr = new SegregatorByNumber(people, k);
					break;
				}
			}
			System.out.println("Provide correct parameter for segregation");

		}
		scan.close();
		return segr;
	}

	// FIXME Change place of displaying it
	public static void displayEndMessage() {
		System.out.println("List(s) successfully created");
	}

}
