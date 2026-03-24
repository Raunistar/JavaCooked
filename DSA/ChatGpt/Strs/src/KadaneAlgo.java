import java.util.Scanner;

public class KadaneAlgo {
  //Kadane's Algorithm
  public static int maxSubarraySum(int[] arr) {
    int currentSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      currentSum = Math.max(arr[i], currentSum + arr[i]);//important
      maxSum = Math.max(maxSum, currentSum);//for updating
    }

    return maxSum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("The maximum subarray sum is : "+maxSubarraySum(arr));
  }
}
