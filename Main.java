import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] arg) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
  }

}