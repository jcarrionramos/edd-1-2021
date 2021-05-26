import java.util.*;

class Pair {
  public int index;
  public Long value;

  public Pair(int index, Long value) {
    this.index = index;
    this.value = value;
  }
}

public class PerdiendoPorPoco {

  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    Pair prices[] = new Pair[N];

    for (int i = 0; i < N; i++) {
      Long current = sc.nextLong();
      prices[i] = new Pair(i, current);
    }

    Arrays.sort(prices, new Comparator<Pair>() {
      @Override
      public int compare(Pair o1, Pair o2) {
        return o1.value.compareTo(o2.value);
      }
    });

    long min = Long.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      System.out.println(prices[i].index + " " + prices[i].value);
    }

    for (int i = 0; i < N - 1; i++) {
      if (prices[i + 1].value - prices[i].value < min && prices[i + 1].index < prices[i].index) {
        min = prices[i + 1].value - prices[i].value;
      }
    }

    System.out.println(min);
  }
}