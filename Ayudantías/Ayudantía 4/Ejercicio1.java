import java.io.*;
import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> guias = new Stack<Integer>();
		Stack<Integer> mayores = new Stack<Integer>();

		int instruccion, ejercicios;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			instruccion = sc.nextInt();
			if (instruccion == 1) { // John agrega una guía con x cantidad de ejercicios.
				ejercicios = sc.nextInt();
				guias.push(ejercicios);

				// Mayores
				if (mayores.empty() || ejercicios >= mayores.peek()) {
					mayores.push(ejercicios);
				}
			} else if (instruccion == 2) { // John decide hacer una guía.
				if (guias.peek() == mayores.peek()) { // Eliminar de la pila de las guias con mayor cantidad
					mayores.pop();
				}
				guias.pop();
			} else if (instruccion == 3) { // Se imprime la guía con mayor cantidad de ejercicios.
				System.out.println(mayores.peek());
			}
		}

	}
}
