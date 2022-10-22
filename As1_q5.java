
//5. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
import java.util.Scanner;

public class As1_q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter your grade");
        char a = s.next.charAt(0);

        System.out.println("encrypted data=" + (a += 8));
        System.out.println("orignal data=" + (a -= 8));
            
        }
    }

}
