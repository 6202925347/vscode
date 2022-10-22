import java.util.ArrayList;

public class Find_odd {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 9 };
        odd(arr);

    }

    public static void odd(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        System.out.println("even number is " + even);
        System.out.println("even number is " + odd);
    }

}
