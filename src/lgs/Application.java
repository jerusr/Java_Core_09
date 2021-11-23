/*
 * LOGOS IT Academy. First Java Core Console Application.
 */

package lgs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author Andriy P.
 * @since Java 1.8
 * @version 23.11.2021
 */

public class Application {

		  public static final String ANSI_RESET = "\u001B[0m";
		  public static final String ANSI_BLACK = "\u001B[30m";
		  public static final String ANSI_RED = "\u001B[31m";
		  public static final String ANSI_GREEN = "\u001B[32m";
		  public static final String ANSI_YELLOW = "\u001B[33m";
		  public static final String ANSI_BLUE = "\u001B[34m";
		  public static final String ANSI_PURPLE = "\u001B[35m";
		  public static final String ANSI_CYAN = "\u001B[36m";
		  public static final String ANSI_WHITE = "\u001B[37m";
		

	
	// Constructor #menu" of application;
	static void menu () {
		System.out.println("Enter '1' to check if the month exists in the database");
		System.out.println("Enter '2' to display all months with the same time of year");
		System.out.println("Enter '3' to display all months that have the same number of days");
		System.out.println("Enter '4' to display all months with fewer days");
		System.out.println("Enter '5' to display all months that have more days");
		System.out.println("Enter '6' to display the next season");
		System.out.println("Enter '7' to display the previous season");
		System.out.println("Enter '8' to display all months that have an even number of days");
		System.out.println("Enter '9' to display all months that have an odd number of days");
		System.out.println("Enter '0' to display whether the month entered from the console has an even number of days ");
		System.out.println("Enter 'exit' to close the application");
	}
	
	// Main application static void;
	@SuppressWarnings("resource")
	public static void main (String[] args) throws WrongInputException, InterruptedException{
		
		// Scanner method;
		Months[] mons = Months.values();
		@SuppressWarnings("unused")
		Seasons[] arraySeasons = Seasons.values();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			menu();
			switch (sc.next()) {
			
			
			
	 case "1": {
		 	System.out.println(ANSI_BLUE+"=== The program for checking the entered month ===");
			System.out.println(ANSI_RESET+"Enter the month");
			sc = new Scanner(System.in);

			String monthSc = sc.next().toUpperCase();
			
			boolean flag = false;
			
			for (Months m : mons) {
				if(m.name().equals(monthSc)) {
					flag = true;
				}
				
			}
			if (flag) {
				System.out.println(ANSI_GREEN+"Month is present"+ANSI_RESET);
			} else {
				String itsWrong = "Months doesnt exist!";
				throw new WrongInputException(itsWrong);
			}
			break;
	 	}
		
			
	 case "2": {
		 	System.out.println(ANSI_BLUE+"=== The withdrawal program for all months with the introduced season ==="+ANSI_RESET);
			System.out.println(ANSI_RESET+"Enter the season");
			sc = new Scanner(System.in);
			String season = sc.next().toUpperCase();
			
			boolean flag2 = false;
			
			for (Months m2 : mons) {
				if(m2.getSeason().name().equalsIgnoreCase(season)) {
					flag2 = true;
				}
			}
			if (flag2 == true) {
				System.out.println(ANSI_GREEN+"Time of the year " +season +" in the next months:"+ANSI_RESET);
				
				for (Months m2_1 : mons) {
					if (m2_1.getSeason().toString().equalsIgnoreCase(season)) {
						System.out.println(ANSI_RESET+m2_1);
					}
				}
			}
			if	(flag2 == false) {
				String itsWrong = "Months doesnt exist!";
				throw new WrongInputException(itsWrong);
			}
			break;
	 	}
		
			
			
		case "3": {
				System.out.println(ANSI_BLUE+"=== The withdrawal program of all months with the number of days entered ==="+ANSI_RESET);
				System.out.println(ANSI_RESET+"Enter number fo days: ");
				sc = new Scanner(System.in);
				int numberOfDays3 = sc.nextInt();

				boolean flag3 = false;

				for (Months months3 : mons) {
					if (months3.getNumberOfDays() == numberOfDays3) {
						flag3 = true;
					}
				}

				if (flag3 == true) {
					System.out.println(ANSI_GREEN+"Number of days " + numberOfDays3 + " in the following months: "+ANSI_RESET);

					for (Months months3_1 : mons) {
						if (months3_1.getNumberOfDays() == numberOfDays3) {
							System.out.println(ANSI_RESET+months3_1);
						}
					}
				}
		  
				if (flag3 == false)
					System.out.println(ANSI_RED+"There are no such months!"+ANSI_RESET);
			}
			
					// Constructor #switch "case 4" днпнахрх!;
		case "4": {
			System.out.println(ANSI_BLUE+"=== Program to show all month that have minor number of days than entered month ==="+ANSI_RESET);
			System.out.println("Enter month");
			sc = new Scanner(System.in);
			String monthSc = sc.next().toUpperCase();
			
			boolean flag4 = false;

			for (Months m : mons) {
				if (m.name().equals(monthSc)) {
					
					flag4 = true;
					
		
					int days = m.getNumberOfDays();
					
	
					for (Months months : mons) {
						if (days > months.numberOfDays) {
							System.out.println(months);
						}
					}

				}

			}
			
			if (!flag4) {
				System.out.println(ANSI_RED+"ENTERED DATA IS WRONG!"+ANSI_RESET);
				break;	
			}
			
		}
					
		case "5": {
			System.out.println(ANSI_BLUE+"=== Program to show all month that have mayor number of days than entered month ==="+ANSI_RESET);
			System.out.println("Enter month");
			sc = new Scanner(System.in);
			String monthSc = sc.next().toUpperCase();
			
			boolean flag5 = false;

			for (Months m : mons) {
				if (m.name().equals(monthSc)) {
					
					flag5 = true;
					
		
					int days = m.getNumberOfDays();
					
	
					for (Months months : mons) {
						if (days < months.numberOfDays) {
							System.out.println(months);
						}
					}

				}

			}
			
			if (!flag5) {
				System.out.println(ANSI_RED+"ENTERED DATA IS WRONG!"+ANSI_RESET);
				break;	
			}
			
		}
		
		case "6": {
			System.out.println(ANSI_BLUE+"=== Program to show season next to entered ==="+ANSI_RESET);
			System.out.println("Enter season");
			sc = new Scanner(System.in);
			String season = sc.next().toUpperCase();
			
			boolean flag6 = false;
			
			for (Months m : mons) {
				if (m.getSeason().name().equals(season)) {
					
					flag6 = true;
					
					if(flag6 == true) {
						if (season.equals("WINTER")) {
							System.out.println(ANSI_GREEN+"Next season is SPRING"+ANSI_RESET);
						} else if (season.equals("SPRING")) {
							System.out.println(ANSI_GREEN+"Next season is SUMMER"+ANSI_RESET);
						} else if (season.equals("SUMMER")) {
							System.out.println(ANSI_GREEN+"Next seasons is AUTUMN"+ANSI_RESET);
						} else if (season.equals("AUTUMN")) {
							System.out.println(ANSI_GREEN+"Next season is WINTER"+ANSI_RESET);
						}
					}
					
				
					}
				
				if (flag6 == false)  {
					System.out.println(ANSI_RED+"INPUT IS WRONG! PLEASE TRY AGAIN."+ANSI_RESET);
				}
				break;

		    	}
		
			}
		
		
		case "7": {
			System.out.println(ANSI_BLUE+"=== Program to show season prior to entered ==="+ANSI_RESET);
			System.out.println("Enter season");
			sc = new Scanner(System.in);
			String season = sc.next().toUpperCase();
			
			boolean flag7 = false;
			
			for (Months m : mons) {
				if (m.getSeason().name().equals(season)) {
					
					flag7 = true;
					
					if(flag7 == true) {
						if (season.equals("WINTER")) {
							System.out.println(ANSI_GREEN+"Prior season is AUTUMN"+ANSI_RESET);
						} else if (season.equals("SPRING")) {
							System.out.println(ANSI_GREEN+"PRIOR season is WINTER"+ANSI_RESET);
						} else if (season.equals("SUMMER")) {
							System.out.println(ANSI_GREEN+"PRIOR seasons is AUTUMN"+ANSI_RESET);
						} else if (season.equals("AUTUMN")) {
							System.out.println(ANSI_GREEN+"PRIOR season is WINTER"+ANSI_RESET);
						}
					}
					
				
					}
				
				if (flag7 == false)  {
					System.out.println(ANSI_RED+"INPUT IS WRONG! PLEASE TRY AGAIN."+ANSI_RESET);
				}
				break;

		    	}
		
			}
		
		
		case "8": {
			System.out.println(ANSI_BLUE+"=== Program to show all months with even number of days ==="+ANSI_RESET);
		
			for (Months m : mons) {

				
				if (m.getNumberOfDays() % 2 == 0) {
					System.out.println(ANSI_GREEN+m.name()+ANSI_RESET);
				}
			}

			break;
		}

		
		case "9": {
			System.out.println(ANSI_BLUE+"=== Program to show all months with odd number of days ==="+ANSI_RESET);
			
			for (Months m : mons) {

				
				if (m.getNumberOfDays() % 2 == 1) {
					System.out.println(ANSI_GREEN+m.name()+ANSI_RESET);
				}
			}

			break;
		}

		case "0": {
			System.out.println(ANSI_BLUE+"=== Program to check if entered month have even or odd number of days ==="+ANSI_RESET);
			System.out.println("Enter month");
			sc = new Scanner(System.in);

		
			String monthSc = sc.next().toUpperCase();
			boolean flag = false;
	
			for (Months months : mons) {

				
				if (months.name().equals(monthSc) & months.getNumberOfDays() % 2 == 0) {
					System.out.println(ANSI_GREEN+"Month has even number of days"+ANSI_RESET);
					flag = true;
				}

				else if (months.name().equals(monthSc) & months.getNumberOfDays() % 2 == 1) {
					System.out.println(ANSI_GREEN+"Month has odd number of days"+ANSI_RESET);
					flag = true;
				}
			}

	
			if (!flag) {
				System.out.println(ANSI_RED+"Sorry input is wrong!"+ANSI_RESET);
			}

			break;
		}
		
		case "exit": {
			System.out.println(ANSI_RED+"Exit from the application..."+ANSI_RESET);
			TimeUnit.SECONDS.sleep(1);
			System.exit(0);
		}
		
			
			}
		}	
	}			
}		