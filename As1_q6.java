//6. Write a Java program to find out whether a given number is greater than the user entered number or not.

import java.util.Scanner;

public class As1_q6 {
    public static void main(String[] args) {
        int a = 50;
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number");
        int b = s.nextInt();
        if (a > b) {
            System.out.print("number is grater");
        } else {
            System.out.print("number is not grater");

        }

    }

}
