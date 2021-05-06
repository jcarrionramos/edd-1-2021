import java.io.*;
import java.util.*;

public class JohnTrabajaPoco {

  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> maxStack = new Stack<Integer>();

    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      int input = sc.nextInt();
      switch (input) {
      case 1:
        int x = sc.nextInt();
        stack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
          maxStack.push(x);
        }
        break;

      case 2:
        int popValue = stack.pop();
        if (popValue == maxStack.peek()) {
          maxStack.pop();
        }
        break;

      case 3:
        System.out.println(maxStack.peek());
        break;
      default:
        break;
      }
    }
  }
}