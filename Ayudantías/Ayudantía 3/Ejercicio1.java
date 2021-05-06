import java.io.*;
import java.util.*;

class Libro {
	int tiempo;
	String nombre;

	Libro(int tiempo, String nombre) {
		this.tiempo = tiempo;
		this.nombre = nombre;
	}
}

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Libro> libros = new Stack<Libro>();
		Stack<Integer> minimos = new Stack<Integer>();

		int n, t, min = Integer.MAX_VALUE, counter = 0;
		String nombre;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			t = sc.nextInt();

			if (t == -1) {
				while (libros.peek().tiempo != minimos.peek()) {
					counter++;
					libros.pop();
				}
				System.out.println(counter + libros.peek().nombre);
				counter = 0;
				libros.pop();
				minimos.pop();
			} else {

				nombre = sc.nextLine();

				if (t == 0) {
					continue;
				}

				if (minimos.isEmpty() || t <= minimos.peek()) {
					minimos.push(t);
				}
				Libro aux = new Libro(t, nombre);
				libros.push(aux);
			}
		}
	}

}
