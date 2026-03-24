public class Main {
  public static void main(String[] args) {
    Stack stack=new Stack();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    stack.displayData();       // [10, 20, 30]
    System.out.println(stack.peek());  // 30 (top, not removed)
    System.out.println(stack.pop());   // 30 (removed)
    stack.displayData();       // [10, 20]
    System.out.println(stack.size());  // 2
  }
}
