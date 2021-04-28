import java.io.*;
import java.util.Scanner;

class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high) {

		int pivote = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivote) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pos = partition(arr, low, high);
			System.out.println("haciendo Qs");

			quickSort(arr, low, pos - 1);
			quickSort(arr, pos + 1, high);
		}
	}

	static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {

		// int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
		// int n = arr.length;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		int arr[];
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			arr[i] = a;
		}

		quickSort(arr, 0, n - 1);
		printArray(arr, n);
	}
}