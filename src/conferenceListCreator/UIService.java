package conferenceListCreator;

import java.util.Scanner;

public class UIService {

	public static boolean getUserInput(Validator valid) {

		System.out.println("Provide parameter for segregation");
		Scanner scan = new Scanner(System.in);
		String control;
		boolean param;

		while (true) {
			control = scan.nextLine();
			param = valid.isValid(control);
			if (param) {
				System.out.println("Provide correct parameter for segregation");;
			}
			else {
				break;
			}
		}		
		scan.close();
		return param;
	}

	public static void displayEndMessage() {
		System.out.println("List(s) successfully created");
	}
	
}
