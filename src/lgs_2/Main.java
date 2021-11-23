package lgs_2;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) throws MyException, IllegalAccessException {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double a;
		double b;

		System.out.println("First number:");

		if (scanner.hasNextInt()) {
			a = scanner.nextInt();

			System.out.println("Second number:");

			if (scanner.hasNextInt()) {
				b = scanner.nextInt();

				Methods calc = new Methods(a, b);

				Methods.viewCalcResult(calc.plus());
				Methods.viewCalcResult(calc.minus());
				Methods.viewCalcResult(calc.multiply());
				Methods.viewCalcResult(calc.devide());
			}

		}
	}	
}
