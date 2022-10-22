
//palindrome - which is redable same from forward or backword
public class Str_as_palindrome {

    public static void main(String[] args) {
        String str = "sushil";

        boolean a = palindrome(str);

        System.out.println(a);

    }

    public static boolean palindrome(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            str2 = c + str2;

        }
        System.out.print(str2);
        if (str.equals(str2)) {
            return true;

        }
        return false;

    }

}
