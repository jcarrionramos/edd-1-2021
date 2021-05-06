import java.io.*;
import java.util.*;

class Book {
  public int problems;
  public String name;

  public Book(int problems, String name) {
    this.problems = problems;
    this.name = name;
  }
}

public class ElLector {

  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();

    Stack<Book> currentStack = new Stack<Book>();
    Stack<Integer> minStack = new Stack<Integer>();

    for (int k = 0; k < N; k++) {
      int problems = sc.nextInt();

      if (problems == -1) {
        int count = 0;
        int minValue = minStack.pop();

        while (true) {
          if (minValue == currentStack.peek().problems) {
            Book minBook = currentStack.pop();
            System.out.println(count + "" + minBook.name);

            // while(!helperStack.isEmpty()){
            // currentStack.push(helperStack.pop());
            // }

            break;

          } else {
            count++;
            currentStack.pop();
            // helperStack.push(currentStack.pop());
          }
        }

      } else {
        String name = sc.nextLine();

        if (problems == 0) {
          continue;
        }

        currentStack.push(new Book(problems, name));

        if (minStack.isEmpty() || minStack.peek() >= problems) {
          minStack.push(problems);
        }
      }
    }

  }
}