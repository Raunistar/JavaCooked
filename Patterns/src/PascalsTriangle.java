import java.util.Scanner;

public class PascalsTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      // print leading spaces for alignment
      for (int s = 0; s < n - i; s++) {
        System.out.print(" ");
      }

      int number = 1;
      for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        // compute next number in the row
        number = number * (i - j) / (j + 1);
      }

      System.out.println(); // new line after each row
    }
    sc.close();
  }
}
