package Structures;

public class LinkedList {
  public Node head;
  public Node tail;

  public LinkedList() {
    head = tail = null;
  }

  public void pushFront(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void pushBack(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }
}
