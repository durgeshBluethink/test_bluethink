package febo;
import java.util.Scanner;

public class fibo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        // System.out.println(num);
        int a=0,b=1;
        int count=0;
        System.out.print(a+" " +b+" ");
        for (int i = 0; i < num; i++) {
            int c =a+b;;
            a=b;
            b=c;
            System.out.print(c+" ");
    
        }
    }
}
