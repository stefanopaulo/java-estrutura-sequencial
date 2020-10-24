import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double value1, value2, total;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		value1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		total = quant1 * value1 + quant2 * value2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f", total);
		
		sc.close();
	}

}
