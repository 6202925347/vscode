import java.util.Scanner;

//4. Evaluate the following expressions using Java program by taking user inputs: ((b^2-4 ac)+(b^2+4 ac))^2/2 ab

public class As1_q4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the value of a");
        int a = s.nextInt();
        System.out.println("enter the value of b");
        int b = s.nextInt();
        System.out.println("enter the value of c");
        int c = s.nextInt();
        int e = ((b * b) - (4 * a * c)) + ((b * b) + (4 * a * c));
        System.out.println(e);
        float d = 2 / 2 * a * b;
        // System.out.println(d);
        System.out.println(Math.pow(e, d));

    }

}
