public class Coman {
    public static void main(String[] args) {

        int[] arr1 = { 2, 5, 6 };
        int[] arr2 = { 2, 3, 6 };
        int[] arr3 = { 2, 4, 6 };
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                        System.out.println("comman element is " + arr1[i]);

                    }

                }
            }
        }

    }
}
