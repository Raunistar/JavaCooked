import java.util.Scanner;

public class FindDuplicate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int expectedSum = (n - 2) * (n - 1) / 2; // sum from 0 to n-2
    int actualSum = 0;
    for (int num : arr) {
      actualSum += num;
    }

    System.out.println(actualSum - expectedSum);
  }
}
