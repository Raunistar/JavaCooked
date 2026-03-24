import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
  public static void main(String[] args) {
    Stack <Character> stack=new Stack<>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string to reverse: ");
    String str=sc.nextLine();

    //Store each char of the string one by one
    for (int i=0;i<str.length();i++){
      stack.push(str.charAt(i));
    }
    System.out.print("The Revresed string is : ");
    for (int i=0;i<str.length();i++){
      System.out.print(stack.pop());
    }

  }
}
