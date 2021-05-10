package Structures;

public class Heap {
  public int[] heap;
  public int size;
  public int maxSize;

  public Heap(int maxSize) {
    this.maxSize = maxSize;
    this.size = 0;
    heap = new int[this.maxSize + 1];
  }

  public int parent(int pos) {
    if (pos == 0) {
      return 0;
    }
    return (pos - 1) / 2;
  }

  public int leftChild(int pos) {
    return (pos * 2) + 1;
  }

  public int rightChild(int pos) {
    return (pos * 2) + 2;
  }

  public void swap(int first, int second) {
    int tmp;
    tmp = heap[first];
    heap[first] = heap[second];
    heap[second] = tmp;
  }

  public boolean isLeaf(int pos) {
    if (pos >= ((size - 1) / 2) && pos <= (size - 1)) {
      return true;
    }
    return false;
  }

  public void insert(int value) {
    if (size >= maxSize) {
      return;
    }

    heap[size] = value;

    int current = size;
    while (heap[current] < heap[parent(current)]) {
      swap(current, parent(current));
      current = parent(current);
    }

    size++;
  }

  public void rebuild(int pos) {
    if (isLeaf(pos))
      return;

    if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {
      if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
        swap(pos, leftChild(pos));
        rebuild(leftChild(pos));
      } else {
        swap(pos, rightChild(pos));
        rebuild(rightChild(pos));
      }
    }
  }

  public int remove() {
    int popped = heap[0];
    heap[0] = heap[size - 1];
    heap[size - 1] = 0;
    size--;
    rebuild(0);
    return popped;
  }

  public void print() {
    for (int i = 0; i <= (size / 2) - 1; i++) {
      System.out.print(
          "PARENT : " + heap[i] + " LEFT CHILD : " + heap[leftChild(i)] + " RIGHT CHILD :" + heap[rightChild(i)]);
      System.out.println();
    }
  }

}
