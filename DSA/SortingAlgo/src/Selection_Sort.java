import java.util.Scanner;

public class Selection_Sort {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();

    //Array declartaion and initialization
    int [] arr=new int[n];
    //iterate over array to take user input
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    //algorithm for selection sort to sort the given array
    for (int i=0;i<n-1;i++){
      int minEleIndex=i;
      for (int j=i+1;j<n;j++){
        if (arr[j]<arr[minEleIndex]){
          minEleIndex=j;
        }
      }
      //Swap elements to sort according to index
      if (minEleIndex!=i){
        int temp=arr[i];
        arr[i]=arr[minEleIndex];
        arr[minEleIndex]=temp;

      }
    }
    //print the sorted array
    // Print the sorted array
    System.out.println("After selection sort:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
