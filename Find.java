public class Find {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 7, 9, 1, 7, 5, 2 };
        boolean kya = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8) {
                kya = true;
            }
        }
        if (kya == true) {
            System.out.println("element present h");
        } else {
            System.out.println("element nahi h");
        }

    }
}
