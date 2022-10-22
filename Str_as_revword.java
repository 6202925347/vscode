public class Str_as_revword {
    public static void main(String[] args) {
        String str = " my name is sushil";
        String b = word(str);

        System.out.println(b);

    }

    public static String word(String str) {
        String str2 = "";
        int n = str.length();
        int i;

        for (i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                str2 = str2 + str.substring(i, n) + ' ';
                n = i;

            }

        }
        str2 += str.substring(i + 1, n);
        return str2;

    }

}
