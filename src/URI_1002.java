

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.0000");
		
		double raio = teclado.nextDouble();
		double pi = 3.14159;
		double area = pi * raio * raio;
		
		System.out.println("A="+formatar.format(area));
		teclado.close();
	}

}
