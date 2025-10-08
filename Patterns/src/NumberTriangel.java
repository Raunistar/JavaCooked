import java.util.*;
public class NumberTriangel {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int N=sc.nextInt();
     // for second row
    for (int i = 1; i <= N; i++) {
      // Print leading spaces
      for (int space = 1; space <= N - i; space++) {
        System.out.print(" ");
      }

      // Print increasing numbers
      for (int j = i; j <= 2 * i - 1; j++) {
        System.out.print(j);
      }

      // Print decreasing numbers
      for (int j = 2 * i - 2; j >= i; j--) {
        System.out.print(j);
      }

      System.out.println();
    }
    sc.close();
  }
}
