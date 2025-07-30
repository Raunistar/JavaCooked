import java.util.*;

public class RemoveDuplicate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the array: ");
    int length = sc.nextInt();

    int[] arr = new int[length];
    System.out.println("Enter the elements of the sorted array:");
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }

    int uniqueLength = removeDuplicates(arr);//function to remove the duplicate elements

    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < uniqueLength; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;

    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[j] != arr[i]) {
        i++;
        arr[i] = arr[j];
      }
    }
    return i + 1;
  }
}
