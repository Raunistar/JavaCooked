import java.util.Scanner;

public class Insertion_Sort {
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
    //Boss loop to bring guest aka key
    for(int i=1;i<n;i++){
      int key=arr[i];//guest finding their own seats
      int j=i-1;
      //Helper loop to create seats for the guests
      //if left elements are bigger then shift them to right
      while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j + 1] = key;//Guest got their right seats
    }
    //print the sorted array
    System.out.println("After Insertion sort:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
