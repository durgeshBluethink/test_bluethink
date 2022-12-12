import java.util.*;

class print_table{
    public static void main(String[] args) {
        Scanner sc  = new  Scanner(System.in);
        System.out.print("Enter a number:");
            int  s= sc.nextInt();
            System.out.println("Number is s: " +s);
            for (int i = 1; i <= 10; i++) {
                int a=s*i;
                System.out.println(s+" * "+i+" = "+a);
            }
    }
}