package febo;
import java.util.Scanner;

public class fibo_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Start number:");
        int n1 = sc.nextInt();
        System.out.print("Enter a end  number:");
        int n2 = sc.nextInt();
        System.out.print("Enter a start previous  number in fibo:");
        int n5 = sc.nextInt();
        // System.out.println(num);
        // int a=0,b=1;
        int count=0;
        int n3=n1+n5;
        System.out.print(n1+" " +n3+" ");
        for (int i = n1; i < n2; i++) {
           
            int n4 =n1+n3;;
            n1=n3;
            n3=n4;
            System.out.print(n4+" ");
    
        }
    }
}
