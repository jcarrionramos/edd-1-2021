import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> lista = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			int plato = sc.nextInt();
			lista.add(plato);
		}
		int max = 0;
		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma += lista.get(i);
			if (i == (n - 1) || lista.get(i + 1) > lista.get(i)) {
				if (suma > max) {
					max = suma;
				}
				suma = 0;
			}
		}
		System.out.println(max);
	}
}