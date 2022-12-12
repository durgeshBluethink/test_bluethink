import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println(num);
        int a=0,b=1,c=0;
        for (int i = 0; i < num; i++) {
            System.out.println(a+" and "+b+" = "+c+" ");
            c=a+b;
            a=b;
            b=c;
    
        }
    }
}
