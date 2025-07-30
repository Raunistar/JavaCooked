import java.util.Scanner;

public class sumEvenIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the array: ");
    int length = sc.nextInt();
    int[] arr = new int[length];

    //taking user input
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }
    //sum of elements at even index
    int sumAll = 0;
    for (int i = 0; i < arr.length; i++) {
      sumAll += arr[i];
    }
    double avg = (double) sumAll / arr.length;

    int sumEvenIndex = 0;
    int countAboveAvg = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        sumEvenIndex += arr[i];
      }
      if (arr[i] > avg) {
        countAboveAvg++;
      }
    }
    System.out.println("The sum of elements at even index is: " + sumEvenIndex);
    System.out.println("The average is: " + avg);
    System.out.println("Number of elements greater than average :"+ countAboveAvg);
  }
}
