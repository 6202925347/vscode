import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arr");
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        System.out.println(" ");

        for (int z = arr.length - 1; z >= 0; z--) {
            System.out.print(arr[z]);
        }

    }
}