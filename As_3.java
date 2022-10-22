import java.util.Scanner;

public class As_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        int i, j, sum = 0;
        for (i = 1; i <= b; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j + "+");

            sum += i;
            System.out.println("=" + sum);

        }

    }

}
