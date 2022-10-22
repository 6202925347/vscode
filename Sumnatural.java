import java.util.Scanner;

public class Sumnatural {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
        int b = 1;
        int sum = 0;

        while (b <= i) {
            sum += b;
            b = b + 1;

        }
        System.out.println(sum);

    }

}
