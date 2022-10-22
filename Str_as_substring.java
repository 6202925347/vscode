public class Str_as_substring {
    public static void main(String[] args) {
        String str = "abc";
        // String a = sub(str);
        // System.out.println(a);
        for (int i = 0; i < str.length(); ++i) {
            for (int j = i; j < str.length(); ++j) {
                for (int k = i; k <= j; ++k) {
                    System.out.print(str.charAt(k));

                }
                System.out.print("");
            }

        }

    }

    // public static String sub(String str) {

    // String b = str.substring(0, 2);

}
