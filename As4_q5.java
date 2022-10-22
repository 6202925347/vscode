import java.util.Arrays;
import java.util.Scanner;

public class As4_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the size of the aaaray");
        int size = sc.nextInt();
        System.out.println("entr the element of the array");

        int[] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = sc.nextInt();
        }
        result(arr);

    }

    public static void result(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            } else {
                arr[i] *= 2;

            }

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);

        }

    }

}