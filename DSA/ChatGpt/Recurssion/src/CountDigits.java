public class CountDigits {
  public static int countDigits(int n){
    if(n < 0) n = -n;      // handle negative

    if(n == 0) return 1;   // 0 has 1 digit

    if(n < 10) return 1;

    return 1 + countDigits(n / 10);
  }

  public static void main(String[] args) {
    System.out.println(countDigits(12345));
  }
}
