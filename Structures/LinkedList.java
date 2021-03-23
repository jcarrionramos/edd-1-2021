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

  public Integer popFront() {
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

  public Integer popBack() {
    if (head == null) {
      return null;
    }

    int returnValue = tail.value;
    if (head == tail) {
      head = tail = null;
      return returnValue;
    }

    Node temp = head;
    while (temp.next != tail) {
      temp = temp.next;
    }

    temp.next = null;
    tail = temp;
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

  public Integer getFirst() {
    if (head == null) {
      return null;
    }
    return head.value;
  }
}
