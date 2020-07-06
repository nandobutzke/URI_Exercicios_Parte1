import java.util.Scanner;

/*	URI_1001
 * 	
 * 	ler(A, B)
 * 	X = A + B
 * 	escrever(X)
 * 	
 * Autor: Fernando Butzke
 * 
 */


public class URI_1001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		int X = A + B;
		System.out.println("X = " + X);
		
		teclado.close();
	}

}
