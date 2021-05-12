import java.io.*;
import java.util.*;

public class MinHeap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		int n, d;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			d = sc.nextInt();
			minHeap.add(d);
		}
		while (!minHeap.isEmpty()) {
			System.out.print(minHeap.poll() + " ");
		}
		System.out.println();
	}
}
