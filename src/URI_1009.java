import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1009 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		String nome = teclado.next();
		double salarioFixo = teclado.nextDouble();
		double totalVendas = teclado.nextDouble();
		
		
		double totalAReceber = totalVendas * 0.15 + salarioFixo;
		System.out.println("TOTAL = R$ "+df.format(totalAReceber));
		
		teclado.close();
		
	}

}
