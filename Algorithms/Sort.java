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

  public static void merge(int arr[], int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int leftArray[] = new int[n1];
    int rightArray[] = new int[n2];

    for (int i = 0; i < n1; i++) {
      leftArray[i] = arr[i + left];
    }

    for (int j = 0; j < n2; j++) {
      rightArray[j] = arr[j + (mid + 1)];
    }

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2) {
      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }

  public static void MergeSort(int arr[], int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;

      // Desordenado
      MergeSort(arr, left, mid);
      MergeSort(arr, mid + 1, right);

      // Ordenados
      merge(arr, left, mid, right);
    }
  }

}
