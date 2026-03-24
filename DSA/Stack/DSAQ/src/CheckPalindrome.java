import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
  public static void main(String[] args) {
    Stack<Character> stack=new Stack<>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string to Check: ");
    String str=sc.nextLine().toLowerCase();

    //Store each char of the string one by one
    for (int i=0;i<str.length();i++){
      stack.push(str.charAt(i));
    }
    String reversed="";
    for(int i=0;i<str.length();i++){
       reversed+=stack.pop();
    }
  if (reversed.equals(str)){
    System.out.print("Its an palindrome.");
  }else{
    System.out.println("Not an palindrome.");
  }
    System.out.print("The reversed string is :"+reversed);
  }
}
