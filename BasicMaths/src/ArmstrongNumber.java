import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check [Armstrong Number] : ");
    int number = sc.nextInt();

    int sum = 0;
    int count = 0;
    int originalNumber = number;


    // First count the number of digits
    while (number > 0) {
      number = number / 10;
      count++;
    }

    // Reset temp to original number
    number = originalNumber;

    // Calculate sum of digits^count
    while (number > 0) {  // Fixed: Using temp instead of number
      int digit = number % 10;
      sum += Math.pow(digit, count);
      number = number / 10;
    }

    if (sum == originalNumber) {
      System.out.println("The given number is an Armstrong number.");
    } else {
      System.out.println("The given number is not an Armstrong number.");
    }

    sc.close();
  }
}
