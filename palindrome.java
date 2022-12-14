import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println("this is number "+num);
        int temp=num;
        int rem,sum=0;
        while (num>0) {
            rem=num%10;
            sum = (sum*10)+rem;
            num/=10;
        }
        if (temp==sum) {
            System.out.println(sum+" is palindrome number");
        } else {
            System.out.println("this  is not  palindrome number");
        }
    }
}
