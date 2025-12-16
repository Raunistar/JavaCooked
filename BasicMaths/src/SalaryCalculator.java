import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int basic=sc.nextInt();
    sc.nextLine();
    String grade = sc.nextLine().toUpperCase();

    int hra=(20*basic)/100;
    int da=(50*basic)/100;
    int pf=(11*basic)/100;
    int allow=0;


    if (grade.equals("A")) {
      allow = 1700;
    } else if (grade.equals("B")) {
      allow = 1500;
    } else if (grade.equals("C")) {
      allow = 1300;
    }


    int salary=basic+hra+da+allow-pf;
    System.out.println(salary);
  }
}
