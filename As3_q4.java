import java.util.Scanner;

public class As3_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr first sub marks");
        int mar1 = sc.nextInt();
        System.out.println("enter thr second sub marks");
        int mar2 = sc.nextInt();
        System.out.println("enter thr 3rd sub marks");
        int mar3 = sc.nextInt();
        System.out.println("enter thr 4th sub marks");
        int mar4 = sc.nextInt();
        System.out.println("enter thr fifth sub marks");
        int mar5 = sc.nextInt();
        System.out.println("enter thr sixt sub marks");
        int mar6 = sc.nextInt();
        float avrage = (mar1 + mar2 + mar3 + mar4 + mar5 + mar6) / 6;
        float per = (mar1 + mar2 + mar3 + mar4 + mar5 + mar6) * 100 / 600;
        System.err.println("avrage marks is " + avrage);
        System.out.println("total persentage is " + per);

    }

}
