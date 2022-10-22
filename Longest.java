package method;

import java.util.*;

public class Longest {
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
        return Math.min(Math.min(a, b), c);

    }

}
