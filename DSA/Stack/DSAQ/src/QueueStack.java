import java.util.Stack;
//Myqueue class using stack
class MyQueue {
  Stack<Integer> stack1;
  Stack<Integer> stack2;

  public MyQueue() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void enqueue(int val) {
    stack1.push(val);
  }

  public int dequeue() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
    return stack2.pop();
  }
}
public class QueueStack {
  public static void main(String[] args) {

   MyQueue stack=new MyQueue();
    stack.enqueue(1);
    stack.enqueue(2);
    stack.enqueue(3);
    stack.enqueue(4);
    System.out.println(stack.dequeue()); // 1
    System.out.println(stack.dequeue()); // 2
    System.out.println(stack.dequeue()); // 3
    System.out.println(stack.dequeue()); // 4


  }
}
