import java.util.Scanner;

/*1. Write a Java program to calculate the total salary of a person. The user has to enter the basic salary as double value, 
and depending upon which the total salary will be calculated as: TotalSalary = (Basic + HRA + DA) – PF, where HRA = 30% of basic salary,
 DA = 100% of basic salary, and PF is ₹ 3,000. If the total salary is ≥ ₹ 50,000, show Grade A, for ≥ ₹ 30,000, show Grade B,
  and for ≤ ₹ 20,000, show Grade C. */
public class As2_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic selary");
        double basic = sc.nextDouble();
        // System.out.println(saliry(basic));

    }

    public static void saliry(double basic) {
        double HRA = basic * (30 / 100);
        double DA = basic * (100 / 100);
        double PF = 3000;
        double total = (basic + HRA + DA) - PF;
        System.out.println(total);
        if (total >= 50000) {
            // System.out.println("total selary is " + total + "grade is A");
            String a = "total sellary is " + total + "Grade is A";
            System.out.println("a");
            // return a;

        } else if (total >= 30000) {
            String a = "total sellary is " + total + "Grade is B";
            // return a;

        } else if (total < 30000) {
            String a = "total sellary is " + total + "Grade is c";
            // return a;

        } else {
            System.out.println("not");
        }

    }
}
