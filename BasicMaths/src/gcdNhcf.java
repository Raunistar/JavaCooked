import java.util.Scanner;

public class gcdNhcf {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first number : ");
    int num1= sc.nextInt();
    System.out.print("Enter second number : ");
    int num2=sc.nextInt();

    //lets follow the eucledian's theorem for GCD
    /*
    Eucledian's theorem states that if x,y are the numbers and x>y
    then return x%y. if x==0 then return y.[this is the modified Eucledians theorem]
    */
    while (num2 != 0) {
      int temp = num2;
      num2 = num1 % num2;  // remainder
      num1 = temp;         // swap
    }

    System.out.println("GCD is: " + num1);
  }
}
