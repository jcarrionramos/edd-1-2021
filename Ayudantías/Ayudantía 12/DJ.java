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
		matrix[x][y] = w; // Dirigido
		matrix[y][x] = w; // No dirigido
	}

	public void remove(int x, int y) {
		matrix[x][y] = 0;
	}

	public void BFS(int start) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.addLast(start);

		while (list.size() != 0) {
			int current = list.removeFirst();

			for (int neighbor = 0; neighbor < V; neighbor++) {
				if (matrix[current][neighbor] != 0 && !visited[neighbor]) {
					list.addLast(neighbor);
					visited[neighbor] = true;
				}
			}
		}
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

	public int minDistance(int dist[], Boolean sptSet[]) {
		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}

		return min_index;
	}

	public void Dijkstra(int start) {
		int dist[] = new int[V];
		Boolean sptSet[] = new Boolean[V]; // Shortest Path Tree Set

		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[start] = 0;

		for (int i = 0; i < V - 1; i++) {
			int u = minDistance(dist, sptSet);
			sptSet[u] = true;

			for (int v = 0; v < V; v++) {
				if (!sptSet[v] && matrix[u][v] != 0 && dist[u] != Integer.MAX_VALUE
						&& dist[u] + matrix[u][v] < dist[v]) {
					dist[v] = dist[u] + matrix[u][v];
				}
			}
		}
		for (int i = 0; i < V; i++) {
			System.out.println((start + 1) + "-->" + (i + 1) + " = " + dist[i]);
		}
	}

}

public class DJ {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int n, m, u, v, w, s;
		n = sc.nextInt(); // Cantidad de vertices
		m = sc.nextInt(); // Cantidad de aristas
		Graph G = new Graph(n);
		for (int i = 0; i < m; i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			w = sc.nextInt();
			G.add(u - 1, v - 1, w);
		}
		s = sc.nextInt(); // Punto de inicio de la busqueda
		G.Dijkstra(s - 1);

	}
}
