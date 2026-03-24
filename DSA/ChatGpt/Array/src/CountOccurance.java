import java.util.Scanner;

public class CountOccurance {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int [] arr=new int[n];

    if (n==0){
      System.out.print("Array is empty.");
      return;
    }

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int  count=0;
    System.out.print("Enter the element to count : ");
    int x=sc.nextInt();
    for (int i=0;i<n;i++){
      if(arr[i]==x){
        count++;
      }
    }
    System.out.print("The no. of occurance is : "+ count);
  }
}
