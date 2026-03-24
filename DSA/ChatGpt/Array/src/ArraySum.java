import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //user input for the length of the array
    System.out.print("Enter the length of the array: ");
    int n= sc.nextInt();
    // array declration
    int [] arr=new int[n];

    //edge case handled here...
    if (n == 0) {
      System.out.println("Array is empty");
      return;
    }
    //taking user input for the elements
    for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
    }

    //iterate through array
    int sum=0;//initialized the sum of the array

    for(int i=0;i<n;i++){
      sum+=arr[i];
    }
    System.out.print("The sum of the elements of given array is : "+sum);

  }
}
