import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;

		raio = sc.nextDouble();

		// calculando a área
		area = Math.PI * (Math.pow(raio, 2.0)); // area = pi * raio²
		System.out.printf("A=%.4f\n", area);

		sc.close();
	}

}
