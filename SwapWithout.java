import java.util.Scanner;

public class SwapWithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Frist Number:");
        int  a= sc.nextInt();
        System.out.print("Enter a Second Number:");
        int  b= sc.nextInt();
         a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Frist Number= "+a);
        System.out.println(" Second Number = "+b);
    }

}
