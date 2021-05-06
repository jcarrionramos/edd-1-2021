import java.io.*;
import java.util.*;

public class Ejercicio2 {

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

		void print(int k1, int k2) {
			printRange(this.root, k1, k2);
		}

		void printRange(Node node, int k1, int k2) {

			if (node == null) {
				return;
			}

			if (k1 < node.value) {
				printRange(node.left, k1, k2);
			}

			if (k1 <= node.value && k2 >= node.value) {
				System.out.println(node.value);
			}

			if (k2 > node.value) {
				printRange(node.right, k1, k2);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();

		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		int n = sc.nextInt();
		int x;

		for (int i = 0; i < n; i++) {

			x = sc.nextInt();
			tree.insert(x);
		}
		tree.print(k1, k2);
	}
}
