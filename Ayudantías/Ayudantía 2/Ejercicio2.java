import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lamina;

		ArrayList<Integer> laminas = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			lamina = sc.nextInt();
			laminas.add(lamina);
		}

		Collections.sort(laminas);

		int repetidas = 0;

		for (int i = 0; i < n - 1; i++) {
			if (laminas.get(i) == laminas.get(i + 1)) {
				repetidas++;
			}
		}
		System.out.println(repetidas);
	}
}