import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1010 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int cod1 = teclado.nextInt();
		int num1 = teclado.nextInt();
		double valoruni1 = teclado.nextDouble();
		int cod2 = teclado.nextInt();
		int num2 = teclado.nextInt();
		double valoruni2 = teclado.nextDouble();
		double valorpagar1 = num1 * valoruni1;
		double valorpagar2 = num2 * valoruni2;
		
		System.out.println("VALOR A PAGAR: R$ " + df.format(valorpagar1 + valorpagar2));
		
		teclado.close();
	}

}
