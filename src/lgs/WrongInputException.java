package lgs;

public class WrongInputException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String itsWrong;

	public WrongInputException(String itsWrong) {
		super(itsWrong);
		this.itsWrong = itsWrong;
	}

	public String getItsWrong() {
		return itsWrong;
	}
	
}
