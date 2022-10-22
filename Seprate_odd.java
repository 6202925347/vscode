import java.util.*;

public class Seprate_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        add(arr);

    }

    public static void add(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }

        }

        System.out.println("new array is " + even);

    }

}
