import java.util.*;

public class Find_grade {
    public static void main(String[] args) {
        Scanner sc  = new  Scanner(System.in);
        System.out.print("Enter a Marks:");
            int  s= sc.nextInt();
            System.out.println("Marks  number is: " +s);
         if (s>=80) {
            System.out.println("Grade is A");
         }
          else if(s>=65) {
            System.out.println("Grade is B");
         }
         else if(s>=50) {
            System.out.println("Grade is C");
         }
         else if(s>=40) {
            System.out.println("Grade is D");
         }
      else{
     
            System.out.println("Fail");
         }
      }
    }

