import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int m=0;
        int flag = 0;
        m=num/2;
        
        for (int i = 2; i <= m; i++) {
            if (num%i==0) {
                System.out.print("this is not prime "+num);
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.print("this is  prime "+num);
        }
    }
}
