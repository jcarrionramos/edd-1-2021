package Structures;

import java.util.LinkedList;

// class Pair {
//   public int neighbor;
//   public int weight;

//   public Pair(int n, int w) {
//     this.neighbor = n;
//     this.weight = w;
//   }
// }

// class GraphList {
//   public int V;
//   public LinkedList<Pair> adj[];

//   public GraphList(int v) {
//     this.V = v;
//     this.adj = new LinkedList[V];

//     for (int i = 0; i < V; i++) {
//       adj[i] = new LinkedList<Pair>();
//     }
//   }

//   public void add(int x, int y, int w) {
//     adj[x].push(new Pair(y, w));
//   }

//   public void remove(int x, int y) {
//   }
// }

public class Graph {
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
  }

  public void remove(int x, int y) {
    matrix[x][y] = 0;
  }

  public void BFS(int start) {
    boolean visited[] = new boolean[V];

    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addLast(start);
    visited[start] = true;

    while (list.size() != 0) {
      int current = list.removeFirst();
      System.out.println(current);

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

  private int minKeyIndex(int[] key, boolean[] visited) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;

    for (int i = 0; i < V; i++) {
      if (!visited[i] && key[i] < min) {
        min = key[i];
        minIndex = i;
      }
    }

    return minIndex;
  }

  public int[] prim() {
    int[] parent = new int[V];
    int[] key = new int[V];
    boolean[] visited = new boolean[V];

    for (int i = 0; i < V; i++) {
      key[i] = Integer.MAX_VALUE;
      visited[i] = false;
    }

    // Partida en el Nodo 0;
    parent[0] = -1;
    key[0] = 0;

    for (int i = 0; i < V - 1; i++) {
      int minIndex = minKeyIndex(key, visited);
      visited[minIndex] = true;

      for (int neighbor = 0; neighbor < V; neighbor++) {
        int edge = matrix[minIndex][neighbor];
        if (edge != 0 && !visited[neighbor] && edge < key[neighbor]) {
          parent[neighbor] = minIndex;
          key[neighbor] = edge;
        }
      }
    }

    return parent;
  }
}
