import java.util.Arrays;
import java.util.Scanner;

public class SortZeroOne {
  public  static void sortZeroOne(int arr[]){
    //edge case handling
    if (arr.length==0) return;

    //count all the 0's
    int countZero=0;
    //loop to count all the 0's
    for (int x : arr){
      if(x==0) countZero++;
    }

    //push all the 0's in the array till countZero length
    for (int i=0;i<countZero;i++){
      arr[i]=0;
    }

    //push all the 1's in the array after countZero length
    for (int i=countZero;i< arr.length;i++){
      arr[i]=1;
    }
    System.out.println("The sorted array is : "+ Arrays.toString(arr));
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();

    int[] arr=new int[n];

    System.out.println("Enter the elements of the array: ");

    //for loop to get user input for the elements
    for (int i=0;i<arr.length;i++){
      arr[i]= sc.nextInt();
    }
   sortZeroOne(arr);

  }
}
