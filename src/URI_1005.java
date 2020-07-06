
import java.text.DecimalFormat;
import java.util.Scanner;


	public class URI_1005 {

		public static void main(String[] args) {
		
			DecimalFormat df = new DecimalFormat("0.00000");
			Scanner teclado = new Scanner(System.in);
			
			double A = teclado.nextDouble();
			double B = teclado.nextDouble();
			double MEDIA = (3.5 * A + 7.5 * B) / 11;
			System.out.println("MEDIA = "+df.format(MEDIA));
		
			teclado.close();		
		}

	}
	