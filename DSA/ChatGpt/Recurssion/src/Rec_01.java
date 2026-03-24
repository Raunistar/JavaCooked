public class Rec_01 {
  public static void recursFunc(int n){
    //Recursion works in 2 step
    //1.Base case to stop the condition to run
    if(n==0) return;
    //2. the condition to perform the operations
    recursFunc(n-1);//calling the function itself => Recursion
   if (n%2==0){
     System.out.print(n +" ");// To print the numbers
   }
  }
  public static void main(String[] args) {

   recursFunc(10);
  }
}
