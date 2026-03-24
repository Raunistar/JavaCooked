import  java.util.HashSet;
public class ArrayUnion {
  //Union of the two arrays
  public static void array_Union(int[] arr1,int[] arr2){
    HashSet<Integer> set = new HashSet<>();

    for(int num : arr1){
    set.add(num);
    }

    for(int num : arr2){
    set.add(num);
    }

    System.out.println(set);
  }
  //Intersection of the two arrays
  public static void array_Intersection(int[] arr1,int[] arr2){
    HashSet<Integer> set = new HashSet<>();

    for(int num : arr1){
      set.add(num);
    }

    for(int num : arr2){
      set.add(num);
    }

    System.out.println(set);
  }
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {3,4,5,6};

    array_Union(arr1,arr2);
    array_Intersection(arr1,arr2);
  }
}
