public class Sum_arr {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 6 };
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
