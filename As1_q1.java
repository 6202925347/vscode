
//1. Write a Java program to detect whether a number entered by the user is an integer or not.
import java.util.Scanner;

public class As1_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            System.out.print("yes nnmber " + num + " is integer");

        } else {
            System.out.println("NO number is not a integer");
        }
    }

}
