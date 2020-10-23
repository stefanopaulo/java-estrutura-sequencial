import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// configurando a localização default do programa
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		
		// número com casas decimais formatadas
		// %n é a quebra de linha
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		String name = "Maria";
		int age = 31;
		double income = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", name, age, income);
	}

}
