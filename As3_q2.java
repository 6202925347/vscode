
//Write a Java program to show the anagram of any user input words.
import java.util.Arrays;

public class As3_q2 {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "sush";
        ana(str1, str2);

    }

    public static void ana(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean r = Arrays.equals(arr1, arr2);
            if (r) {
                System.out.println("a anagram");

            } else {
                System.out.println(" not a anagam");
            }

        }

    }

}
