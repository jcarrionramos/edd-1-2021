package Structures;

public class BinarySearchTree {
  public TreeNode root;

  public BinarySearchTree() {
    root = null;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insertIt(int value) {
    TreeNode newNode = new TreeNode(value);

    if (isEmpty()) {
      root = newNode;
      return;
    }

    TreeNode current = root;
    while (true) {
      if (current.value > newNode.value) {
        // Left side
        if (current.left == null) {
          current.left = newNode;
          return;
        } else {
          current = current.left;
        }
      } else {
        // Right side
        if (current.right == null) {
          current.right = newNode;
          return;
        } else {
          current = current.right;
        }
      }
    }
  }

  public void insertRec(int value) {
    if (isEmpty()) {
      root = new TreeNode(value);
      return;
    }

    insertRec(root, value);
  }

  public TreeNode insertRec(TreeNode current, int value) {
    if (current == null)
      return new TreeNode(value);

    if (value < current.value)
      current.value = insertRec(current.left, value);
    else
      current.value = insertRec(current.right, value);

    return current;
  }

  public void preOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    System.out.println(root.value);
    preOrder(root.left);
    preOrder(root.right);
  }

  public void inOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    inOrder(root.left);
    System.out.println(root.value);
    inOrder(root.right);
  }

  public void postOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.value);
  }

}
