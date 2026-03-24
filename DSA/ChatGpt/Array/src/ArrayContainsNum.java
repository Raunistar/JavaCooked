import java.util.Scanner;

public class ArrayContainsNum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int [] arr=new int[n];
    boolean exitsNum=false;
    if (n==0){
      System.out.print("Array is empty.");
      return;
    }
    for (int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int x= sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==x){
        exitsNum=true;
        break;
      }
    }
    System.out.print(exitsNum);
  }
}
