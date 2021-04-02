import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Boolean estaWeno = true;
		Stack<Character> pila = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{') {
				pila.push(s.charAt(i));
			} else if (s.charAt(i) == '}') {
				if (pila.size() == 0) {
					estaWeno = false;
					break;
				} else {
					pila.pop();
				}
			}
		}
		if (pila.size() > 0) {
			estaWeno = false;
		}
		System.out.println(estaWeno);
	}
}