import java.util.Scanner;

public class HourGlassPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int n = sc.nextInt();

    // Top half
    for (int i = 1; i <= n; i++) {
      // leading spaces
      for (int s = 1; s < i; s++) {
        System.out.print(" ");
      }
      // numbers from i to n
      for (int j = i; j <= n; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    // Bottom half
    for (int i = n - 1; i >= 1; i--) {
      // leading spaces
      for (int s = 1; s < i; s++) {
        System.out.print(" ");
      }
      // numbers from i to n
      for (int j = i; j <= n; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
