import java.util.ArrayList;

public class As4_q3 {
    public static void main(String[] args) {
        ArrayList<String> std = new ArrayList<>();
        std.add("a");
        std.add("b");
        std.add("c");
        std.add("d");
        std.add("f");
        std.remove(1);
        std.remove(2);
        std.add("j");
        std.add("k");

        System.out.println(std);

    }

}
