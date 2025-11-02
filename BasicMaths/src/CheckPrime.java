import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int n) {
      if (n <= 1) {
        return false;
      }
      if (n == 2) {  // 2 is the only even prime
        return true;
      }
      if (n % 2 == 0) {  // Eliminate even numbers
        return false;
      }
      // Check odd divisors up to √n
      for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to check [Prime number] : ");
    int number=sc.nextInt();

    //check for the prime number
    System.out.print(isPrime(number));
  }
}
