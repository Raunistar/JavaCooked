import java.util.Scanner;

public class SlidingWindow {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();
    System.out.print("Enter the length of subarray:");
    int k =sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int windowSum=0;
    for (int i=0;i<k;i++){
      windowSum+=arr[i];
    }
    int maxSum=windowSum;
    for (int i=k;i<n;i++){
      windowSum = windowSum - arr[i - k] + arr[i];
      maxSum = Math.max(maxSum, windowSum);
    }
    System.out.print("The max sum of subarray from given array is :"+windowSum);

  }
}
