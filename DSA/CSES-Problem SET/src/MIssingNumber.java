import java.util.Scanner;

public class MIssingNumber {
  public static void main(String[] args) {
    //Problem Statement
    /*
    * You are given all numbers between 1,2,\ldots,n except one. Your task is to find the missing number.
      Input The first input line contains an integer n.
      The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).

    *Output
       Print the missing number.
       Constraints

       2 \le n \le 2 \cdot 10^5

        Example
        Input:
        5
        2 3 1 5

        Output:
        4
    */
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of inputs: ");
    int n=sc.nextInt();


    int actualSum=(n*(n+1))/2;
    int expectedSum=0;
    for (int i=1;i<n;i++){

      int input=sc.nextInt();
      expectedSum+=input;
    }
    System.out.print("The missing number is :"+ (actualSum-expectedSum));

  }
}
