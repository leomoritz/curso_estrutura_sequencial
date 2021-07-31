import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoFuncionario, horasTrabalhadas;
		double valorHora, salarioFuncionario;

		codigoFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();

		salarioFuncionario = horasTrabalhadas * valorHora;

		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", 
				codigoFuncionario, salarioFuncionario);

		sc.close();
	}

}
