import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
  public int value;
  public Node left, right;

  public Node(int value) {
    this.value = value;
    left = right = null;
  }
}

class BinarySearchTree {
  public Node root;

  public BinarySearchTree() {
    root = null;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
      root = newNode;
      return;
    }

    Node current = root;
    while (true) {
      if (current.value > newNode.value) {
        if (current.left == null) {
          current.left = newNode;
          return;
        } else {
          current = current.left;
        }
      } else {
        if (current.right == null) {
          current.right = newNode;
          return;
        } else {
          current = current.right;
        }
      }
    }
  }

  public void pushToArray(Node root, ArrayList<Integer> values) {
    if (root == null) {
      return;
    }

    values.add(root.value);
    pushToArray(root.left, values);
    pushToArray(root.right, values);
  }

  public boolean isUniqueValueTree(Node root) {
    ArrayList<Integer> values = new ArrayList<Integer>();
    pushToArray(root, values);

    int baseValue = root.value;
    for (Integer current : values) {
      if (current != baseValue) {
        return false;
      }
    }

    return true;
  }
}

public class SoloElMismoValor {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] arg) {
    int n = sc.nextInt();
    BinarySearchTree bst = new BinarySearchTree();

    for (int i = 0; i < n; i++) {
      bst.insert(sc.nextInt());
    }

    if (bst.isUniqueValueTree(bst.root)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

  }
}