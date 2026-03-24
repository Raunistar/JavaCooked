import java.util.Scanner;

public class ToggleCase {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sentence: ");
    String str = sc.nextLine();

    if (str.length() == 0) {
      System.out.print("Empty string!!");
      return;
    }

    StringBuilder sb = new StringBuilder(str);

    for (int i = 0; i < sb.length(); i++) {

      char ch = sb.charAt(i);

      if (Character.isLowerCase(ch)) {

        sb.setCharAt(i, Character.toUpperCase(ch));

      } else if (Character.isUpperCase(ch)) {

        sb.setCharAt(i, Character.toLowerCase(ch));
      }
    }

    System.out.print("New sentence is: " + sb.toString());
  }
}
