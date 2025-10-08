import java.util.Scanner;

public class printDivisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find all the divisors: ");
    int number = sc.nextInt();
    int count = 0;

    System.out.print("The divisors of the given number are: ");
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.print(i + " ");
        count++;
      }
    }

    System.out.println();
    System.out.println("The number of divisors: " + count);
  }
}
