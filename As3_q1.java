//1. Write a program to calculate the sum and the average of the numbers occurring in the multiplication table of 225860.
public class As3_q1 {
    public static void main(String[] args) {

        int num = 225860;
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
            sum += num * i;

            System.out.printf("%d * %d = %d \n", num, i, num * i);

        }
        System.out.println("\n sum is  " + sum);
        System.out.println("avrg is    " + sum / 10);
    }
}
