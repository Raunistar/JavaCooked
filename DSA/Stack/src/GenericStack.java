import java.util.ArrayList;

public class GenericStack<T> {
  private ArrayList<T> data;//ArrayList with generic property to holds data.

  //Constructor
  public GenericStack(){
    data=new ArrayList<>();//Arraylist declared to store elements.
  }

  //Add elements on the top.
  public void push(T value){
    data.add(value);
  }

  //Remove elements from the stack
  public T pop(){
    if (data.isEmpty()){
      throw new RuntimeException("Stack is empty.Can't remove element.");
    }
    return data.remove(data.size()-1);
  }

  //Peek the top elements without removing it
  public T peek(){
    if (data.isEmpty()){
      throw new RuntimeException("Stack is empty.Can't remove element.");
    }
    return data.get(data.size()-1);
  }

  //Check if stack is empty or not
  public boolean isEmpty(){
    return data.size()==0;
  }

  //Get the size of the stack
  public int size(){
    return data.size();
  }

  //Display all the elements
  // TO STRING (for printing)
  @Override
  public String toString() {
    return data.toString();
  }
}
public static void printStack(ArrayList<Integer> stack){

}
