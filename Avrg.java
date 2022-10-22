import java.util.*;

public class Avrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr yor element of the array");
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        avg(arr);

    }

    public static void avg(int[] arr) {
        float sum = 0;
        Arrays.sort(arr);
        System.out.println("shorted arr is" + Arrays.toString(arr));

        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];

        }
        System.out.println("aavrg is " + sum / (arr.length - 2));

    }

}
