import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1, qtdPeca1, peca2, qtdPeca2;
		double valorPeca1, valorPeca2, valorTotalPeca;

		peca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		peca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		valorTotalPeca = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

		System.out.println("Códigos Peças: " + peca1 + "," + peca2);
		System.out.println("VALOR A PAGAR: R$" + valorTotalPeca);

		sc.close();

	}

}
