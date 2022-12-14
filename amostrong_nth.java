import java.util.Scanner;

public class amostrong_nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        // System.out.println("Number is s: " + num);
        int n = num;
        String s = String.valueOf(num);
        int digit = s.length();
        int  power = digit;

        int sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + (int) Math.pow(digit, power);
            n = n / 10;
        }

        if (num == sum&num!=0) {
            System.out.println("this number is  "+sum+" amostrong number ");
        } else {
            System.out.println("this number is not "+sum+"  amostrong number ");
        }

    }
}
