import java.util.*;
public class HollowPyramid {
  public static void main(String[] args) {
    // You can test with different values
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the rows : ");
    int n=sc.nextInt();

    // Print first row
    for (int i = 1; i <= n; i++) {
      System.out.print(i);
    }
    System.out.println();

    // Print middle rows
    for (int row = 2; row <= n - 1; row++) {
      System.out.print(1); // First column

      // Print spaces
      for (int space = 1; space <= n - 2; space++) {
        System.out.print(" ");
      }

      System.out.print(n); // Last column
      System.out.println();
    }

    // Print last row (only if n > 1)
    if (n > 1) {
      for (int i = 1; i <= n; i++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
