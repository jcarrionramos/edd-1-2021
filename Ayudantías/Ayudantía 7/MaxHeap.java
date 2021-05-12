import java.io.*;
import java.util.*;

public class MaxHeap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

		int n, d;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			d = sc.nextInt();
			maxHeap.add(d);
		}
		while (!maxHeap.isEmpty()) {
			System.out.print(maxHeap.poll() + " ");
		}
		System.out.println();
	}

}
