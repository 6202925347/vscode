import java.util.Scanner;

public class As4_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of your array");
        int size = sc.nextInt();
        System.out.println("entr the element of your aray");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        bub(arr);

    }

    public static void bub(int[] arr) {
        int temp=0;  
        for{int i=0;i< arr.length-1;i++}{
            for(int j=0;j<arr.length-i-1;j++)
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
         for{int i=0;i< arr.length-1;i++}{
            System.out.println(arr[i]);
         }
    }

}
