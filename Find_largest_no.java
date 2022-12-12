import java.util.Scanner;

public class Find_largest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Frist Number:");
        int  a= sc.nextInt();
        System.out.print("Enter a Second Number:");
        int  b= sc.nextInt();
        System.out.print("Enter a Third Number:");
        int  c= sc.nextInt();
        System.out.print("Enter a Fourth Number:");
        int  d= sc.nextInt();
      //1  System.out.println("This a Four Number:"+a+" "+b+" "+c+" "+d);
        if (a>b) {
            if (a>c) {
                if (a>d) {
                    System.out.print("this is largest number: "+a);
                }
                else{
                    System.out.print("this is largest number: "+d);
                }
            }
        }
        else if(b>c){
            if (b>d) {
                System.out.print("this is largest number: "+b);
            }
            else{
                System.out.print("this is largest number: "+d);
            }
        }
        else if(c>d){
            System.out.print("this is largest number: "+c);
        }
        else{
            System.out.print("this is largest number: "+d);
        }
      
    
    }
}
