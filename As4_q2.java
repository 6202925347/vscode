package method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class As4_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of your array");
        int size = sc.nextInt();
        System.out.println("entr the element of your aray");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        max(arr);

    }

    public static void max(int[] arr) {
        Arrays.sort(arr);
        System.out
                .println("the sesond smallest number is " + arr[1] + "second largesr number is" + arr[arr.length - 2]);

    }

}
