package Algorithms;

public class Sort {

  // O(n^2)
  public static void BubbleSort(int arr[]) {
    int length = arr.length;
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - 1 - i; j++) {
        if (arr[j] >= arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // O(n^2)
  public static void SelectionSort(int arr[]) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      int minIndex = i;

      for (int j = i + 1; j < length; j++) {
        if (arr[j] <= arr[minIndex]) {
          minIndex = j;
        }
      }

      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

  }

  // O(n^2)
  public static void InsertionSort(int arr[]) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      int swapValue = arr[i];

      int j = i - 1;
      while (j >= 0 && arr[j] > swapValue) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }

      arr[j + 1] = swapValue;
    }
  }
}
