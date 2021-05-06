import java.io.*;
import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int hidratacion, distancia;

		int indice_estacion = 0;
		int sumahidratacion = 0;

		for (int i = 0; i < n; i++) {
			hidratacion = sc.nextInt();
			distancia = sc.nextInt();

			sumahidratacion += hidratacion - distancia;

			if (sumahidratacion < 0) {
				indice_estacion = i + 1;
				sumahidratacion = 0;
			}
		}
		System.out.println(indice_estacion);
	}
}
