import java.util.Scanner;

public class WeirdAlgorithm {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num=sc.nextInt();

    //edge case
    if (num<=0){
      System.out.print("Please enter a positive integer.");
      return;
    }
    while(num!=1){
      if (num%2==0){
         num=num/2;
        System.out.println(num);
      } else {
        num=num*3+1;
        System.out.println(num);
      }
    }
  }
}
