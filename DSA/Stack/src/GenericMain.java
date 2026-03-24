public class GenericMain {
  public static void main(String[] args) {
    // Stack of Integers
    GenericStack<Integer> intStack = new GenericStack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    System.out.println(intStack);          // [1, 2, 3]
    System.out.println(intStack.pop());    // 3
    System.out.println(intStack.peek());   // 2

    // Stack of Strings
    GenericStack<String> strStack = new GenericStack<>();
    strStack.push("Raunistar");
    strStack.push("is");
    strStack.push("learning");
    System.out.println(strStack);          // [Raunistar, is, learning]
    System.out.println(strStack.pop());    // learning

    // Stack of Doubles
    GenericStack<Double> dblStack = new GenericStack<>();
    dblStack.push(3.14);
    dblStack.push(2.71);
    System.out.println(dblStack.peek());   // 2.71
  }
}
