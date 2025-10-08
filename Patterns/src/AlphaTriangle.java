import java.util.*;
public class AlphaTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();  // Changed from 'row' to 'N'

    // Print pattern
    for (int row = 0; row < N; row++) {
      char current = (char)('A' + N - 1 - row);

      for (int col = 0; col <= row; col++) {
        System.out.print((char)(current + col));
      }
      System.out.println();
    }

    sc.close(); // Good practice to close scanner
  }
}
