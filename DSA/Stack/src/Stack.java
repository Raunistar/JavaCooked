import java.util.ArrayList;

public class Stack {
  private ArrayList<Integer> data;//ArrayList to hold data.

  //Constructor function
  public Stack(){
    data=new ArrayList<>();
  }

  //Push method to add elements to the stack(on the top)
  public void push(int value){
    data.add(value);//this will add the value
  }

  //Pop method to remove the last added elements
  public int pop(){
    if (isEmpty()){
      throw new RuntimeException("Stack is empty. can't remove element.");
    }
    return data.remove(data.size()-1);
  }

  //Peek element without removing it
  public int peek(){
    if (isEmpty()){
      throw new RuntimeException("Stack is empty. can't peek element.");
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
  public void displayData(){
    System.out.println(data);
  }
}
