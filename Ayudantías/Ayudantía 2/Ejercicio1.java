import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int puntaje;

		ArrayList<Integer> puntajes = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			puntaje = sc.nextInt();
			puntajes.add(puntaje);
		}

		Collections.sort(puntajes);

		int diferencia = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {
			if (puntajes.get(i + 1) - puntajes.get(i) < diferencia) {
				diferencia = puntajes.get(i + 1) - puntajes.get(i);
			}
		}
		System.out.println(diferencia);
	}
}