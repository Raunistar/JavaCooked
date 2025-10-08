public class CheckForPrime {

  // Helper method for recursion
  public static boolean isPrimeRecursive(int n, int divisor) {
    // If divisor * divisor > n, no divisor found → prime
    if (divisor * divisor > n) {
      return true;
    }
    // If divisible, not prime
    if (n % divisor == 0) {
      return false;
    }
    // Check next divisor
    return isPrimeRecursive(n, divisor + 1);
  }

  public static boolean checkPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    return isPrimeRecursive(n, 3); // start checking from 3
  }

  public static void main(String[] args) {
    System.out.println(checkPrime(29)); // true
    System.out.println(checkPrime(15)); // false
  }
}
