import java.util.Scanner;

public class URI_1003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		
		int PROD = (x) * (y);
		
		System.out.println("PROD = " + PROD);
		
		teclado.close();

	}

}
