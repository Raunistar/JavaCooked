import java.util.Scanner;

public class MoveZeroToEnd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    if (n == 0) {
      System.out.print("Array is empty.");
      return;
    }
    int left = 0;
    int right = n - 1;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    while (left < right) {
      if (arr[left] == 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
      }
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
