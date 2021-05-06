import java.io.*;
import java.util.*;

public class BST {

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

		void inorder() {
			inorderPrint(root);
		}

		void inorderPrint(Node root) {
			if (root != null) {
				inorderPrint(root.left);
				System.out.println(root.value);
				inorderPrint(root.right);
			}
		}

		void preorder() {
			preorderPrint(root);
		}

		void preorderPrint(Node root) {
			if (root != null) {
				System.out.println(root.value);
				preorderPrint(root.left);
				preorderPrint(root.right);
			}
		}

		void postorder() {
			postorderPrint(root);
		}

		void postorderPrint(Node root) {
			if (root != null) {
				postorderPrint(root.left);
				postorderPrint(root.right);
				System.out.println(root.value);
			}
		}

	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();

	}
}
