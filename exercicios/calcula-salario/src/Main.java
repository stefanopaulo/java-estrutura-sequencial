import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int number, workedHours;
		double valueOfHourWorked, salary;
		
		number = sc.nextInt();
		workedHours = sc.nextInt();
		valueOfHourWorked = sc.nextDouble();
		
		salary = valueOfHourWorked * (double) workedHours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}

}
