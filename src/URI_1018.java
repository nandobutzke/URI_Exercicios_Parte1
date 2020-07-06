import java.util.Scanner;

public class URI_1018 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		
		int nota100 = valor / 100;
		int nota50 = valor / 50;
		
		int nota20 = nota50 - 20;
		int nota10 = nota20 - 10;
		int nota5 = nota10 - 5;
		int nota2 = nota5 - 2;
		int nota1 = nota2 - 1;
		
		System.out.println(valor);
		
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
		
		teclado.close();

	}

}
