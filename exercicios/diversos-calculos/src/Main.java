import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaT, areaC, areaTP, areaQ, areaR;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaT = a * c / 2.0;
		areaC = Math.PI * Math.pow(c, 2.0);
		areaTP = (a + b) / 2 * c;
		areaQ = Math.pow(b, 2.0);
		areaR = a * b;
		
		System.out.printf("TRIANGULO = %.3f%n", areaT);
		System.out.printf("CIRCULO = %.3f%n", areaC);
		System.out.printf("TRAPEZIO = %.3f%n", areaTP);
		System.out.printf("QUADRADO = %.3f%n", areaQ);
		System.out.printf("RETANGULO = %.3f%n", areaR);
		
		sc.close();
	}

}
