import java.io.*;
import java.util.*;

public class JohnOrdenImporta {

  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    Queue<Integer> current = new LinkedList<Integer>();
    Queue<Integer> perfect = new LinkedList<Integer>();

    for (int i = 0; i < N; i++) {
      current.add(sc.nextInt());
    }

    for (int i = 0; i < N; i++) {
      perfect.add(sc.nextInt());
    }

    int count = 0;
    while (!perfect.isEmpty()) {
      count++;
      if (current.peek() == perfect.peek()) {
        perfect.remove();
        current.remove();
      } else {
        current.add(current.remove());
      }
    }

    System.out.println(count);

  }
}