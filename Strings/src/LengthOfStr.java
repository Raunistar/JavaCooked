import java.util.*;
public class LengthOfStr {
  public static void main(String[] args) {
    //taking user input
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str= sc.nextLine();

    //counting length of string without length() method.
    int count = 0;
    for (char c : str.toCharArray()) {
      count++;
    }
    System.out.println("Length: " + count);
  }
}
