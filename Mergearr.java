public class Mergearr {
    public static void main(String[] args) {

        int arr1[] = { 4, 6, 2, 7, 9 };

        int arr2[] = { 6, 3, 9, 2, 1 };

        int arr3[] = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            count++;
        }

        for (int j = 0; j < arr2.length; j++) {

            // System.out.println(arr3[i]);
            arr3[count++] = arr2[j];

        }
        System.out.println("the merged array is \n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
