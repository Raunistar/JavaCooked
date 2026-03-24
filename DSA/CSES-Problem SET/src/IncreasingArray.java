import java.util.Scanner;

public class IncreasingArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length:");
    int n=sc.nextInt();

    int[] arr=new int[n];

    for (int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    //Move count loop
    int move=0;
    for (int i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        move+=arr[i]-arr[i+1];
        arr[i+1]=arr[i];
      }
    }
    System.out.print("Move count is :"+ move);
  }
}
