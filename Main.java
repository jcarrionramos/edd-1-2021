import Structures.Heap;

public class Main {
  public static void main(String[] arg) {
    System.out.println("The Min Heap is ");
    Heap minHeap = new Heap(15);
    minHeap.insert(5);
    minHeap.insert(3);
    minHeap.insert(17);
    minHeap.insert(10);
    minHeap.insert(84);
    minHeap.insert(19);
    minHeap.insert(6);
    minHeap.insert(22);
    minHeap.insert(9);

    minHeap.print();
    System.out.println("The Min val is " + minHeap.remove());
    minHeap.print();
  }

}