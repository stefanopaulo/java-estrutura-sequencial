import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double r, area;
		
		r = sc.nextDouble();
		
		area = Math.PI * Math.pow(r, 2.0);
		
		System.out.printf("AREA = %.4f%n", area);
		
		sc.close();
	}

}
