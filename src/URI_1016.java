
import java.util.Scanner;

public class URI_1016 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int D = teclado.nextInt();
		int tempoEmMinutos = (60 * D) / 30;					//regra de três
		System.out.println(tempoEmMinutos + " minutos");
		
		teclado.close();
	}

}
