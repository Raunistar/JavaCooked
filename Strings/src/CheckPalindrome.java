import java.util.Scanner;

public class CheckPalindrome {
  public static boolean isPalindrome(String str) {
    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    return str.equals(reversed);
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str=sc.nextLine();
    System.out.println(isPalindrome(str));
  }
}
