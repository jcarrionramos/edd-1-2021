import java.io.*;
import java.util.*;

class Graph {
	public int V;
	public int[][] matrix;

	public Graph(int v) {
		this.V = v;
		this.matrix = new int[V][V];

		// Inicializar matriz con ceros
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	// Agregamos una arista
	public void add(int x, int y, int w) {
		matrix[x][y] = w;
		matrix[y][x] = w;
	}

	public void remove(int x, int y) {
		matrix[x][y] = 0;
	}

	public void BFS(int start) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> list = new LinkedList<Integer>();

		int result[] = new int[V]; // El resultado del ejecicio
		for (int i = 0; i < V; i++) {
			result[i] = -1;
		}

		list.addLast(start);
		result[start] = 0;

		while (list.size() != 0) {
			int current = list.removeFirst();
			int currentDistance = result[current];

			for (int neighbor = 0; neighbor < V; neighbor++) {
				if (matrix[current][neighbor] != 0 && !visited[neighbor]) {
					list.addLast(neighbor);
					visited[neighbor] = true;
					result[neighbor] = currentDistance + 6;
				}
			}
		}
		for (int i = 0; i < V; i++) {
			if (i != start) {
				System.out.print(result[i] + " ");
			}
		}
		System.out.println();
	}

	public void DFS(int start) {
		boolean visited[] = new boolean[V];

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(start);
		visited[start] = true;

		while (list.size() != 0) {
			int current = list.removeFirst();
			System.out.println(current);

			for (int neighbor = 0; neighbor < V; neighbor++) {
				if (matrix[current][neighbor] != 0 && !visited[neighbor]) {
					list.addFirst(neighbor);
					visited[neighbor] = true;
				}
			}
		}
	}
}

public class Ejercicio1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int t, n, m, u, v, s;
		t = sc.nextInt(); // Cantidad de casos
		for (int i = 0; i < t; i++) {
			n = sc.nextInt(); // Cantidad de vertices
			m = sc.nextInt(); // Cantidad de aristas
			Graph G = new Graph(n);
			for (int j = 0; j < m; j++) {
				u = sc.nextInt();
				v = sc.nextInt();
				G.add(u - 1, v - 1, 6);
			}
			s = sc.nextInt(); // Punto de inicio de la busqueda
			G.BFS(s - 1);
		}

	}
}
