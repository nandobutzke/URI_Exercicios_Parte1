import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1012 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		double pi = 3.14159;
		
		double areaTriangulo = A * C / 2;
		double areaCirculo = pi * C * C;
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.println("TRIANGULO: " + df.format(areaTriangulo));
		System.out.println("CIRCULO: " + df.format(areaCirculo));
		System.out.println("TRAPEZIO: " + df.format(areaTrapezio));
		System.out.println("QUADRADO: " + df.format(areaQuadrado));
		System.out.println("RETANGULO: " + df.format(areaRetangulo));
		
		teclado.close();
	}

}
