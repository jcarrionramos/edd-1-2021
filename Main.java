import Structures.*;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.pushBack(1);
    list.pushBack(2);
    list.pushBack(3);
    list.pushFront(4);
    list.popBack();
    list.popFront();

    Node current = list.head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }

  }
}