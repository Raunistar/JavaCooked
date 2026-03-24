import java.util.Scanner;

public class FindMaximum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//length of the array.
    //array declration
    int [] arr=new int[n];

    //iterate through array to take user input
    for (int i=0;i<n;i++){
      arr[i]= sc.nextInt();//taking user imput
    }
    //iterate through array
    int maxElement=arr[0];
    int minElement=arr[0];
    for (int i=0;i<n;i++) {
      //to find maximum
      if (arr[i] > maxElement) {
        maxElement = arr[i];
      }
      //to find minimum
      if (arr[i]<minElement){
        minElement=arr[i];
      }

    }
    System.out.print("max Element in the given array is : " + maxElement);
    System.out.println();
    System.out.print("min Element in the given array is : " + minElement);
  }
}
