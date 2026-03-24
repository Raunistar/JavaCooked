import java.util.Stack;

public class SortElements {
  public static void main(String[] args) {
    Stack<Integer> mainStack=new Stack<>();
    mainStack.push(8);
    mainStack.push(14);
    mainStack.push(2);
    mainStack.push(78);

    Stack<Integer> sortedStack=new Stack<>();
    while (!mainStack.isEmpty()){
      int temp=mainStack.pop();
      while(!sortedStack.isEmpty() && sortedStack.peek()>temp){
        mainStack.push(sortedStack.pop());
      }
      sortedStack.push(temp);
    }
    System.out.print(sortedStack+" ");
  }
}
