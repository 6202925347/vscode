import java.util.Scanner;

public class As_1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int c = a.nextInt();
        int sum = 0, num, pr = 1;
        if (c == 1) {
            for (num = 1; num <= n; n++) {
                sum += num;
            }
            System.out.println(sum);
        }

        else if (c == 2) {
            for (num = 1; num <= n; n++) {
                pr += num;

            }
            System.out.println(pr);
        } else {
            System.out.println(-1);
        }
    }

}
