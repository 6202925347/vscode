
import java.util.Scanner;
public class Odd {
    


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
            int i = a.nextInt();
            int sum=0;
            
            int c=1;
            while(c<=i){
                System.out.println(2*c-1);
                c++;
                sum+=2*c-1;
            }System.out.println(sum);



    }
}

    

