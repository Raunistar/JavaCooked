public class FactorialNum {
  public static int fact_Num(int n){
    if (n==0 || n==1){
      return 1;
    }
    return n*fact_Num(n-1);
  }
  public static void main(String[] args) {
    System.out.println("The factorial of given number is:"+fact_Num(3));
  }
}
