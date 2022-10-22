
//2. Write a Java program that asks the user to enter his/her name and greets them with“Hello,you are coding for PCC-CS593 Lab.”message
import java.util.Scanner;

public class As1_q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");

        String a = s.next();

        System.out.println("hello " + a + " you are coding for PCC-CS593 Lab ");

    }

}
