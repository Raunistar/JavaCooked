import java.util.Scanner;

public class RemoveCharacter {

  public static String removeCharacter(String str, char ch) {
    StringBuilder sb = new StringBuilder(str);

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == ch) {
        sb.deleteCharAt(i);
        i--; // go back one position after deletion
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a String: ");
    String str = sc.nextLine();

    System.out.print("Enter a character to remove: ");
    char ch = sc.next().charAt(0);

    System.out.println(removeCharacter(str, ch));
  }
}
