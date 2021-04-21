import java.io.*;
import java.util.*;

public class VueltaOlimpica {

  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();

    int startIndex = 0;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      int hidratation = sc.nextInt();
      int distance = sc.nextInt();

      sum += hidratation - distance;

      if (sum < 0) {
        sum = 0;
        startIndex = i + 1;
      }
    }

    System.out.println(startIndex);
  }
}