import java.util.Stack;
//MIN stack from scratch
class MinStack {
  //creating Main and min stack
  Stack<Integer> mainStack;
  Stack<Integer> minStack;

  // Constructor method to actually create the stack in memory
  public MinStack() {
    mainStack = new Stack<>();
    minStack = new Stack<>();
  }

  //Method to push the data
  public void push(int val){
    mainStack.add(val);
    if (minStack.isEmpty() || val <= minStack.peek()) {
      minStack.push(val);  // new minimum found!
    }
  }
  //Method to remove  element and check for the minimum
  public int pop(){
    if (mainStack.isEmpty()){
      throw new RuntimeException("Stack is empty.Can't remove element.");
    }
    int removed = mainStack.pop();
    if (removed == minStack.peek()) {
      minStack.pop();
    }
    return removed;
  }
  //Method to get the actual  minimum element
  public int getMin(){
    if (minStack.isEmpty()){
      throw new RuntimeException("Stack is empty.Can't remove element.");
    }
    return minStack.peek();
  }
}

//Main method
public class MinElementStack {
  public static void main(String[] args) {
    MinStack stack = new MinStack();
    stack.push(9);
    stack.push(8);
    stack.push(4);
    System.out.println(stack.getMin());
  }
}
