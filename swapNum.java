import java.util.Scanner;

public class swapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Frist Number:");
        int  a= sc.nextInt();
        System.out.print("Enter a Second Number:");
        int  b= sc.nextInt();
    int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("this is swap number "+"Frist Number= "+a+" Second Number = "+b);


    }
}
