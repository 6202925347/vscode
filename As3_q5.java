import java.util.Scanner;

public class As3_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String a = sc.next();
        a = a.toLowerCase();

        int vowel = 0;
        for (int i = 0; i < a.length(); ++i) {
            char b = a.charAt(i);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
                ++vowel;

            }

        }
        System.out.println(vowel);

    }
}
