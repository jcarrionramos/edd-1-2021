import java.io.*;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		int n, c, cargaTotal = 0, sumaCarga;

		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		n = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			c = sc.nextInt();
			minHeap.add(c);
		}

		while (minHeap.size() > 1) {
			sumaCarga = minHeap.poll() + minHeap.poll();
			minHeap.add(sumaCarga);
			cargaTotal += sumaCarga;
		}
		System.out.println(cargaTotal);
	}
}
