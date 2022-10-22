// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 9 };
        arr = plusOne(arr);
        printArray(arr);
    }

    public static int[] plusOne(int[] digits) {

        int size = digits.length;
        if (digits[size - 1] == 9) {
            int[] digitsNew = new int[size + 1];
            for (int i = size; i > 0;) {
                int num = digits[i - 1] + 1;
                if (num == 10) {
                    int carry = num / 10;
                    int value = num % 10;
                    digitsNew[i] = value;
                    digitsNew[i - 1] += carry;
                    i -= 1;
                } else {

                    int value = num;
                    digitsNew[i] = value;
                    i--;
                }

            }
            return digitsNew;
        }
        int k = digits[size - 1];
        digits[size - 1] = k + 1;
        return digits;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}