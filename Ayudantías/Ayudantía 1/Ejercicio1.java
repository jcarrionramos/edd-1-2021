import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("aja");
		} else {
			System.out.println("ayno");
		}
	}
}