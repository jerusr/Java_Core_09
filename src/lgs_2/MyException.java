package lgs_2;

public class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String MyExceptionWrongClass;

	public MyException(String MyExceptionWrongClass) {
		super(MyExceptionWrongClass);
		this.MyExceptionWrongClass = MyExceptionWrongClass;
	}

	public String getMyExceptionWrongClass() {
		return MyExceptionWrongClass;
	}
	
}
