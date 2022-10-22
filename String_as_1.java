public class String_as_1 {

    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "dccb";
        boolean a = chek(str, str2);
        System.out.println(a);

    }

    public static boolean chek(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        }
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            ++arr[c];

        }
        for (int i = 0; i < str2.length(); i++) {
            char d = str2.charAt(i);
            --arr[d];

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }

}
