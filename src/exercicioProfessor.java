import java.util.Locale;
import java.util.Scanner;

public class exercicioProfessor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, metroQuadrado, area, preco;

		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("�REA = %.2f\n", area);
		System.out.printf("PRE�O = %.2f\n", preco);
		
		sc.close();

	}

}
