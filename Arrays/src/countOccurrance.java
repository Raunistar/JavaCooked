import java.util.Scanner;

public class countOccurrance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the array: ");
    int length = sc.nextInt();

    int[] arr = new int[length];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }
    int count=0;
    System.out.println("Enter the number you want to count : ");
    int num=sc.nextInt();
    for (int i=0;i<arr.length;i++){
      if(arr[i]==num){
        count++;
      }
    }
    System.out.println("The number of times element "+num+" appeared is : "+count);
  }
}
