import java.util.Scanner;
import java.util.Stack;

public class ValidParenthasis {
  public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the parentheses: ");
    String str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
        stack.push(str.charAt(i));
      }
      if (str.charAt(i) == ')') {
        if (stack.isEmpty() || stack.pop() != '(') {
          System.out.println("Invalid!");
          return;
        }
      }
      if (str.charAt(i) == '}') {
        if (stack.isEmpty() || stack.pop() != '{') {
          System.out.println("Invalid!");
          return;
        }
      }
      if (str.charAt(i) == ']') {
        if (stack.isEmpty() || stack.pop() != '[') {
          System.out.println("Invalid!");
          return;
        }
      }
    }

    if (stack.isEmpty()) {
      System.out.println("Valid!");
    } else {
      System.out.println("Invalid!");
    }
  }
}
