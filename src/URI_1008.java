import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int number = teclado.nextInt();
		int horas = teclado.nextInt();
		double salarioHora = teclado.nextDouble();
		System.out.println("NUMBER = "+number);
		System.out.println("SALARY = U$ "+df.format(salarioHora * horas));
		
		teclado.close();
	}
}
