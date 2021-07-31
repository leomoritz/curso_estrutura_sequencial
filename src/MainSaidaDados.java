import java.util.Locale;

public class MainSaidaDados {

	public static void main(String[] args) {
		
		 // Escrevendo conte�do de vari�veis 
		 int y = 32; 
		 double x = 10.35784;
		 
		 System.out.println(y); System.out.println(x);
		  
		 // Escrevendo conte�do da vari�vel com formata��o 
		 System.out.printf("%.2f%n",x); System.out.printf("%.4f\n", x);
		 
		 // Alterando localidade do sistema para imprimir com . ao inv�s de ,
		 Locale.setDefault(Locale.US); // Seta para localidade US
		 System.out.printf("%.2f%n", x); 
		 /* O comando acima Imprimir� com "." ao inv�s de "," devido a
		 * ter alterado a localidade para US, pois antes o java pegava a 
		 * localidade padr�o do sistema
		 */ 
		  
		 // Concatenando sa�da de elementos
		  
		 System.out.println("RESULTADO = " + x + " METROS");
		 System.out.print("RESULTADO = " + y + " LARGURA");
		 System.out.printf("\nRESULTADO = %.2f METROS\n", x);
		  
		 // Concatenando sa�da com v�rios elementos formatados 
		 String nome = "Bruna";
		 int idade = 26; 
		 double salario = 4000.0;
		  
		 System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade,
		 salario);
		 		

	}

}
