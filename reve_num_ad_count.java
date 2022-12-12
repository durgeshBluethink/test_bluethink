import java.util.Scanner;

public class reve_num_ad_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Number is s: " + num);

        int rem, rev = 0;
        int count = 0;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
            count++;
        }
        System.out.println("this is reverse number " + rev);
        System.out.println("this is count number " + count);
        int sum=0;
        while (rev != 0) {
            int rm = rev % 10;
            sum = sum+rm;
            rev /= 10;
        }
        System.out.println("this is sum of reverse number  number " + sum);
    }
}
