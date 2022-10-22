import java.util.Scanner;

public class As_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int term = a.nextInt();
        int ele, N = 1;
        for (ele = 1; ele <= term; ele++) {
            int num = 3 * N + 2;
            if (num % 4 != 0) {
                System.out.println(num + " ");
            }
            N++;
        }
    }
}
