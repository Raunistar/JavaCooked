import java.util.Scanner;

public class SecondLargest {
  public static int secondLargest(int[] arr,int n){
    //edge case handling
    if(arr.length<2) return -1;

    //variables to declare
    int largest = Integer.MIN_VALUE;
    int secondLargest= Integer.MIN_VALUE;

    //for loop to iterate in array
    for (int i=0;i<arr.length;i++){
      int x=arr[i];
      if (x>largest){
        secondLargest=largest;
        largest=x;
      } else if(x<largest && x>secondLargest){
        secondLargest=x;
      }
    }
    //all elements same case

    if (secondLargest==Integer.MIN_VALUE){
      int largestCount=0;
      for(int num:arr){
        if (num == largest) largestCount++;
      }
      if(largestCount==n){
        return -1;
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int n=sc.nextInt();
    int[] arr=new int[n];

    for (int i=0;i<arr.length;i++){
      System.out.println("Enter the array elements: ");
      arr[i]= sc.nextInt();
    }

    System.out.println(secondLargest(arr,n));

  }
}
