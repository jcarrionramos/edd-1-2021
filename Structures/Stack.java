package Structures;

public class Stack {
  public Node head;

  public Stack() {
    head = null;
  }

  public void push(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public Integer pop() {
    if (head == null) {
      return null;
    }

    int returnValue = head.value;
    if (head.next == null) {
      head = null;
      return returnValue;
    }

    head = head.next;
    return returnValue;
  }

  public boolean find(int value) {
    Node current = head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }

    return false;
  }
}
