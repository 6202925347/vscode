package method;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter your second nubmber");
        int b = sc.nextInt();
        System.out.println("enter your thordnubmer");
        int c = sc.nextInt();
        System.out.println(small(a, b, c));

    }

    public static int small(int a, int b, int c) {
        int sum = a + b + c;
        int avrg = sum / 3;
        return avrg;

    }
}