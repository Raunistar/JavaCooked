import java.util.*;

public class FindUnique {
  public static int findUniqueElement(int arr[]){
      //handling the edge case
    if(arr.length==0) return -1;

    //for loop to iterate in the given array
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i += 2) {

      if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
        return arr[i];
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();

    int[] arr=new int[n];

    System.out.println("Enter the elements of the array: ");

    //for loop to get user input for the elements
    for (int i=0;i<arr.length;i++){
      arr[i]= sc.nextInt();
    }
    System.out.println(findUniqueElement(arr));
  }
}
