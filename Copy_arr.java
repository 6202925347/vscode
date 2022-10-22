import java.util.Arrays;

public class Copy_arr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 9 };
        int[] new_arr = new int[5];
        System.out.println("arrys" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];

        }
        System.out.print("new arrays " + Arrays.toString(new_arr));

    }

}
