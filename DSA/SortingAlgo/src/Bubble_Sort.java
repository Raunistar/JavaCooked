import java.util.Scanner;

public class Bubble_Sort {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();

    //Array declartaion and initialization
    int [] arr=new int[n];

    //edge case handled here
    if (n<=1){
      return;
    }
    //iterate over array to take user input
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    //Algorithm for the bubble sort to sort the given array
    for (int i=0;i<n-1;i++){
      boolean isSwapped=false;
      for (int j=0;j<n-1-i;j++){
        if (arr[j]>arr[j+1]){
           int temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
           isSwapped=true;
        }
      }
      //if no swap happened
      if (!isSwapped){
        break;

      }
    }
    //print the sorted array
    System.out.println("After Bubble sort:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
