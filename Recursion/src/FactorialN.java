import java.util.Scanner;

public class FactorialN {
  public static int factFN(int number) {
    // Base case
    if (number == 0 || number == 1) {
      return 1;
    }
    // Recursive case
    return number * factFN(number - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();

    int result = factFN(N);
    System.out.println("The factorial of " + N + " is: " + result);
  }
}
