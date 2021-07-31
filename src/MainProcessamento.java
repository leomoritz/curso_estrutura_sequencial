
public class MainProcessamento {

	public static void main(String[] args) {
		
		//processamento de dados com vari�veis do mesmo tipo
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		//processamento de dados com vari�veis de tipos diferentes (casting)
		double z;
		z = 2 * x; //O resultado � convertido para double (casting impl�cito)
		System.out.println(x);
		System.out.println(z);
		
		double b, B, h, area; // float b, B, h, area;
		
		b= 6.0; //b = 6f;
		B = 8.0; //B = 8f;
		h = 5.0; //h = 5f;
		
		area = (b+B) / 2.0 * h;
		System.out.println(area);
		
		int a;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b; //casting expl�cito dos valores com (double)
		System.out.println(resultado);
		
		double c = 5.0;
		b = (int) c; //casting expl�cito dos valores com (int)
		
	}

}
