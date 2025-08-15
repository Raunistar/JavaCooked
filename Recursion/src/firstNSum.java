import java.util.Scanner;

public class firstNSum {
  public static void firstNSum(int n, int current, int sum) {
    if (current > n) {
      System.out.println("Total Sum = " + sum);
      return;
    }

    sum += current; // add current number
    System.out.println("Current Sum after adding " + current + " = " + sum);

    firstNSum(n, current + 1, sum); // move to next number
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();

    firstNSum(N, 1, 0); // start from 1 with sum = 0
  }
}
