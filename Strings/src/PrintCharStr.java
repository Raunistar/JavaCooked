import java.util.*;
public class PrintCharStr {
  public static void main(String[] args) {
    //taking user input
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str= sc.nextLine();

    // implementing logic to print each chars of a string.
    for (int i=0;i<str.length();i++){
      System.out.print(" "+str.charAt(i));
    }
  }
}
