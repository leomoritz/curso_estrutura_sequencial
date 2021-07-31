import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A=0, B=0, C=0, D=0, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = ((A * B) - (C * D));
		
		System.out.println("DIFERENÇA = " + DIFERENCA);
				
		sc.close();

	}

}
