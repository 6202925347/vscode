
//3. Write a program to calculate the percentage of a given student in the 10th board exam. His marks from 5 subjects must be taken as 
//input from the keyboard. (Marks are out of 100
import java.util.Scanner;

public class As1_q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the first subject marks");
        int a = s.nextInt();
        System.out.print("enter the second subject marks");
        int b = s.nextInt();
        System.out.print("enter the third subject marks");
        int c = s.nextInt();
        System.out.print("enter the fourth subject marks");
        int d = s.nextInt();
        System.out.print("enter the fifth subject marks");
        int e = s.nextInt();
        int total = a + b + c + d + e; // total means total marks obtend
        float percentage = (total) * 100 / 500; // here 500 is total marks of exam
        System.out.println(percentage);

    }

}
