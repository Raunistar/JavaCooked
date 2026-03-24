import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatee {
  public static void findDuplicateV1(int[] arr){
    HashSet<Integer> set= new HashSet<>();
    for (int i=0;i< arr.length-1;i++){
        if (set.contains(arr[i])){
          System.out.println(arr[i]);
         return;
      }else{
          set.add(arr[i]);
        }
    }
  }
  public static void findFreq(int[] arr){
    /*
    count=0;
    arr[i]==arr[j]->count++;
    sout(arr[i] +"->"+ count);
     */


    for (int i=0;i< arr.length;i++){
      int count =1;
      if(arr[i]== -1){
        continue;
      }
      for (int j=i+1;j< arr.length;j++){
        if (arr[i]==arr[j]){
          count++;
          arr[j]=-1;
        }
      }
      System.out.println(arr[i] +"->"+count);
    }
  }
  public static void findFreqV2(int[] arr){
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i=0;i< arr.length;i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      } else {
        map.put(arr[i],1);
      }
    }
    System.out.println(map);
  }
  public static void main(String[] args) {
    int arr[]=new int[5];
    arr[0]=1;
    arr[1]=1;
    arr[2]=1;
    arr[3]=3;
    arr[4]=2;
    findFreqV2(arr);
  }
}
