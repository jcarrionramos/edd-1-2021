package Structures;

public class Queue {
  public Node head;
  public Node tail;

  public Queue() {
    head = tail = null;
  }

  public void push(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public Integer pop() {
    if (head == null) {
      return null;
    }

    int returnValue = head.value;
    if (head == tail) {
      head = tail = null;
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
