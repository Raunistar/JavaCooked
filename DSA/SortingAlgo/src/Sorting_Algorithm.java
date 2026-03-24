import java.util.Scanner;

public class Sorting_Algorithm {
  //Selection sort algorithm
  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      int minElementIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minElementIndex]) {
          minElementIndex = j;

        }
      }
      //swap
      if (minElementIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minElementIndex];
        arr[minElementIndex] = temp;
      }
    }
    // Print the sorted array
    System.out.println("After selection sort:");
    for (int num : arr) {
      System.out.print(num + " ");
    }

  }
  //Bubble sort algorithm
  public static void bubble_sort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;

      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }

      // If no swapping happened, array is sorted
      if (!swapped) {
        break;
      }
    }
    // Print the sorted array
    System.out.println("After bubble sort:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
  //Insertion sort algorithm
  public static void insertion_sort(int[] arr){
   //store arrays length in a variable
    int n=arr.length;

    //Boss loop to bring guest aka key
    for(int i=1;i<n;i++){
      int key=arr[i];
      int j=i-1;
      //Helper loop to create seats for the guests
      while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
    // Print the sorted array
    System.out.println("After Insertion sort:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();

    int[] arr=new int[n];

    System.out.println("Enter the elements of the array : ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    bubble_sort(arr);

  }
}
