import java.util.ArrayList;
import java.util.Scanner;

public class Factor {
    public static ArrayList<Integer> sum(int num) {
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                f.add(i);
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();

        System.out.print(sum(num));
    }

}
