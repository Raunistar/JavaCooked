import java.util.Scanner;

public class BinarySearch {

  public static int binarySearch(int[] arr, int target) {
  int left=0;
  int right=arr.length-1;
  while(left<=right){
    int mid=left+(right-left)/2; //overflow secure
    if (target==arr[mid]){
      return mid;//target found 
    } else if (arr[mid]<target) {
      left=mid+1;
    }else if(arr[mid]>target){
      right=mid-1;
    }
  }
  return -1;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array:");
    int n=sc.nextInt();
    System.out.print("Enter the target:");
    int target=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++){
      arr[i]= sc.nextInt();
    }
// CORRECT
    int result = binarySearch(arr, target);
    if (result != -1)
      System.out.println("Found at index: " + result);
    else
      System.out.println("Not found.");
  }
}
