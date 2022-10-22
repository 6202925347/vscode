public class Dublicate {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'b' };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println(arr[j]);
                }
            }
        }

    }

}
