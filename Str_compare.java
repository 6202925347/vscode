public class Str_compare {

    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "dbca";

        System.out.println(str.equals(str2));
        int com = str.compareTo(str2);
        if (com < 0) {
            System.out.println("str is smaller");

        } else if (com == 0) {
            System.out.println("number is equals");
        } else {
            System.out.println(" str2 i grater");
        }
        System.out.println(str.concat(str2));
        System.out.println(str.charsOf(str2));
    }

}
