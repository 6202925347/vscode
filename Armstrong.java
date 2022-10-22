import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        String num = "371";
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            Double c = Math.pow(num.charAt(i), 3);

            System.out.println(c);
            sum += c;
        }
        String sum1 = Integer.toString(sum);
        System.out.println(sum1);
        if (num == sum1) {
            System.out.println("number is armstrong");

        } else {
            System.out.println("nuber is not a armstrong");
        }

    }

}
