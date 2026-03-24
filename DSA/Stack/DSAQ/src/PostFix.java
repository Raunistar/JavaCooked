import java.util.Scanner;
import java.util.Stack;

public class PostFix {
  public static void main(String[] args) {
    //declare the stack
    Stack <Integer> stack=new Stack<>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the query: ");
    String query=sc.nextLine();
    String[] tokens = query.split(" ");
    int result=0;
    for (String token : tokens) {
      if (token.equals("+")) {
       int a =stack.pop();
       int b=stack.pop();
       result=b+a;
       stack.push(result);

      } else if(token.equals("-")){
        int a =stack.pop();
        int b=stack.pop();
        result=b-a;
        stack.push(result);

      }else if(token.equals("*")){
        int a =stack.pop();
        int b=stack.pop();
        result=a*b;
        stack.push(result);

      } else if (token.equals("/")) {
        int a =stack.pop();
        int b=stack.pop();
        result=b/a;
        stack.push(result);

      } else {
        // parse and push number
        int num=Integer.parseInt(token);
        stack.push(num);

      }
    }

    // final answer
    System.out.println(result);
  }
}
