package lgs_2;

public class Methods {
	
	private static double a;
	private static double b;
	
	public Methods(double a2, double b2) {
		a = a2;
		b = b2;
	}

	public double plus () throws IllegalAccessException, MyException {
		Methods.check();
		return a + b;
	}

	public double minus () throws IllegalAccessException, MyException {
		Methods.check();
		return a - b;
	}
	
	public double multiply () throws IllegalAccessException, MyException {
		Methods.check();
		return a * b;
	}
	
	public double devide () throws IllegalAccessException, MyException {
		Methods.check();
		return a / b;
	}
	
	static void viewCalcResult(double result) {
		System.out.println("Result of operation: " + result);
	}
	
	private static void check() throws MyException, IllegalAccessException {
		if ((a<0) && (b<0)) {
			throw new IllegalArgumentException();
		} 
		if (((a==0) && (b !=0)) || ((a !=0) && (b ==0))) {
			throw new ArithmeticException();
		}
		if ((a==0) && (b==0)) {
			throw new IllegalAccessException();
		}
		if ((a>0) && (b>0)) {
			String MyExceptionWrongClass = "System Error";
			throw new MyException(MyExceptionWrongClass);
		}
		
	}

}
