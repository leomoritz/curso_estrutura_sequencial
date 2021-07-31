import java.util.Locale;
import java.util.Scanner;

public class MainEntradaDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Pra aceitar o separador "." ao digitar
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char xy;

		// lendo um string (uma palavra)
		x = sc.next();
		System.out.println("Voc� digitou: " + x);

		// lendo um n�mero inteiro
		y = sc.nextInt();
		System.out.println("Voc� digitou: " + y);

		// lendo um valor ponto flutuante
		z = sc.nextDouble();
		System.out.println("Voc� digitou: " + z);

		// lendo um valor char
		xy = sc.next().charAt(0); // Fun��o charAt(pos) pega uma letra do String
		System.out.println("Voc� digitou: " + xy);

		// Lendo v�rios valores sequencialmente
		String palavra;
		int inteiro;
		double flutuante;

		palavra = sc.next();
		inteiro = sc.nextInt();
		flutuante = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(palavra);
		System.out.println(inteiro);
		System.out.println(flutuante);

		String s1, s2, s3;

		sc.nextLine();// Para consumir a diferen�a da quebra de linha
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
