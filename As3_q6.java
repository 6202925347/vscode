import java.util.Scanner;

public class As3_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yor string");
        String s = sc.next();
        int sum = 0;
        int j;
        for (int i = 0; i < s.length(); i++) {
            j = s.charAt(i);
            System.out.println(j);
            sum += j;

        }
        System.out.println(sum);

    }

}
