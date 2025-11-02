import java.util.Scanner;

public class PalindromeString {
  public static boolean isPalindrome(String str, int left, int right) {
    if (left >= right) {
      return true;
    }
    if (str.charAt(left) != str.charAt(right)) {
      return false;
    }
    return isPalindrome(str, left + 1, right - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of string to check [Palindrome] : ");
    String str = sc.nextLine();

    boolean result = isPalindrome(str, 0, str.length() - 1);

    if (result) {
      System.out.println("It is a palindrome!");
    } else {
      System.out.println("It is not a palindrome.");
    }
  }
}
