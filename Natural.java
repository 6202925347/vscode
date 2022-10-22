import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
        int b=1;
        int sum=0;
        while(b<=i){
            System.out.println(b);
            b++;
            sum+=b;
        }
        
        System.out.println(sum);
        System.out.print( sum/i);
    }
    
}
