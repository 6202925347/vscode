import java.util.Arrays;

public class Arr_insert {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 9 };

        int pos = 3;
        int ele = 10;

        System.out.println("arrys" + Arrays.toString(arr));
        for (int i = 0; i < pos; i++) {
            arr[i] = arr[i + 1];

        }
        arr[pos] = ele;
        System.out.println("new arrays" + Arrays.toString(arr));

    }

}
