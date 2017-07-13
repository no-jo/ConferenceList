package conferenceListCreator;

public class UserInputException extends RuntimeException {

	/**
	 * Business exception used to notify user of incorrect parameter for creating a conference list.
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Provided number is too big";
	}

}
