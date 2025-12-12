import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {
  public static void swapAlternate(int arr[]){
    //edge case handling
    if (arr.length==0) return;

    //for loop to iterate in array
    for (int i=0;i< arr.length-1;i+=2){
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
    System.out.println("The elements are swapped :"+ Arrays.toString(arr));
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
    swapAlternate(arr);
  }
}
