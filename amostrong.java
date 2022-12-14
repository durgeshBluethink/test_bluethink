import java.util.Scanner;

public class amostrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println("this is number "+num);
        int temp=num;
        int rem;
        int sum=0;
        while (num>0) {
            rem=num%10;
              sum =sum+(rem*rem*rem);
             num=num/10;            
        }
        if (temp==sum) {
            System.out.println("this is amostrong number"+sum);
        } else {
            System.out.println("this is not  amostrong number"+sum);
        }
    }
}
