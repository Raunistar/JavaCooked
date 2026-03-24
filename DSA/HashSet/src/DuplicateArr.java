import java.util.HashSet;

public class DuplicateArr {
  //Check duplicate array value using set
  public static void check_duplicate(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    boolean found = false;
    for (int num : arr) {

      if (!set.add(num)) {
        System.out.println("Duplicate : "+num);
      }
    }
    if (!found){
      System.out.println("Your array has no duplicates.");
    }

  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
      check_duplicate(arr);
    }
  }
