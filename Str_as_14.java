public class Str_as_14 {

    // word count
    public static void main(String[] args) {
        String str = "this is my laptop";
        int a = count(str);
        System.out.print(a);

    }

    public static int count(String str) {
        int space = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                ++space;

            }
        }
        return space + 1;
    }
}
