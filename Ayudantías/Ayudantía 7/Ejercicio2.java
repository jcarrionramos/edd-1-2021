import java.io.*;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		int n, p, suma = 0;

		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

		n = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			p = sc.nextInt();
			maxHeap.add(p);
			suma += p;
		}
		while (maxHeap.peek() > suma / n) {
			System.out.println(maxHeap.poll());
		}
	}
}
