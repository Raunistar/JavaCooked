public class DigitsSum {
  public static int digits_Sum(int n){
    //base case
    if (n==0){
      return n;
    }
    int sum=n%10;
    return sum+digits_Sum(n/10);
  }
  public static void main(String[] args) {
    System.out.println("Sum of digits : "+digits_Sum(123));
  }
}
