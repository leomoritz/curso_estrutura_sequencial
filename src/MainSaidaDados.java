import java.util.Locale;

public class MainSaidaDados {

	public static void main(String[] args) {
		
		 // Escrevendo conteúdo de variáveis 
		 int y = 32; 
		 double x = 10.35784;
		 
		 System.out.println(y); System.out.println(x);
		  
		 // Escrevendo conteúdo da variável com formatação 
		 System.out.printf("%.2f%n",x); System.out.printf("%.4f\n", x);
		 
		 // Alterando localidade do sistema para imprimir com . ao invés de ,
		 Locale.setDefault(Locale.US); // Seta para localidade US
		 System.out.printf("%.2f%n", x); 
		 /* O comando acima Imprimirá com "." ao invés de "," devido a
		 * ter alterado a localidade para US, pois antes o java pegava a 
		 * localidade padrão do sistema
		 */ 
		  
		 // Concatenando saída de elementos
		  
		 System.out.println("RESULTADO = " + x + " METROS");
		 System.out.print("RESULTADO = " + y + " LARGURA");
		 System.out.printf("\nRESULTADO = %.2f METROS\n", x);
		  
		 // Concatenando saída com vários elementos formatados 
		 String nome = "Bruna";
		 int idade = 26; 
		 double salario = 4000.0;
		  
		 System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade,
		 salario);
		 		

	}

}
