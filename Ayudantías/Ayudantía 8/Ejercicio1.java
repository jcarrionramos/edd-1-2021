import java.io.*;
import java.util.*;

public class Ejercicio1 {

	static class Node {

		int value;
		Node left, right;

		public Node(int item) {
			value = item;
			left = right = null;
		}
	}

	static class BinarySearchTree {

		Node root;

		public BinarySearchTree() {
			root = null;
		}

		void insert(int value) {
			root = insertNode(root, value);
		}

		Node insertNode(Node root, int value) {

			if (root == null) {
				root = new Node(value);
				return root;
			}
			if (value < root.value)
				root.left = insertNode(root.left, value);
			else if (value > root.value)
				root.right = insertNode(root.right, value);
			return root;
		}

		void print() {
			inorderPrint(root);
		}

		void inorderPrint(Node root) {
			if (root != null) {
				inorderPrint(root.left);
				System.out.print(root.value + " ");
				inorderPrint(root.right);
			}
		}

		int suma() {
			return sumaNode(root);
		}

		int sumaNode(Node root) {
			if (root == null) {
				return 0;
			} else {
				return root.value + sumaNode(root.left) + sumaNode(root.right);
			}
		}

		int max() {
			return maxNode(root);
		}

		int maxNode(Node root) {
			if (root == null)
				return 0;
			int max = root.value;
			int left = maxNode(root.left);
			int right = maxNode(root.right);

			if (left > max) {
				max = left;
			}
			if (right > max) {
				max = right;
			}
			return max;

		}

		void delete(int value) {
			root = deleteNode(root, value);
		}

		Node deleteNode(Node root, int value) {
			if (root == null)
				return root;

			if (value < root.value)
				root.left = deleteNode(root.left, value);
			else if (value > root.value)
				root.right = deleteNode(root.right, value);

			else {
				if (root.left == null)
					return root.right;
				else if (root.right == null)
					return root.left;

				root.value = minValue(root.right);
				root.right = deleteNode(root.right, root.value);
			}

			return root;
		}

		int minValue(Node root) {
			int minv = root.value;
			while (root.left != null) {
				minv = root.left.value;
				root = root.left;
			}
			return minv;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();

		int n = sc.nextInt();
		int p = sc.nextInt();
		int instruccion, x, suma, maximo, p_inicial = p;

		for (int i = 0; i < n; i++) {

			instruccion = sc.nextInt();

			if (instruccion == 1) {
				suma = tree.suma();
				if (suma > p)
					System.out.println("POCO DINERO");

			} else if (instruccion == 2) {
				maximo = tree.max();
				if (maximo > p_inicial / 10)
					System.out.println("MAXIMO");

			} else if (instruccion == 3) {
				x = sc.nextInt();
				tree.insert(x);
				p -= x;
			}
		}
	}
}
