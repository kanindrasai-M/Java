package conditonalStatements; // this is a package to creating
import java.util.Scanner; // this a scanner where taken values from user

public class ifElse { // this class is used for if-else conditional statements
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // this is scanner object
       System.out.print("Enter Number:");
       int i = sc.nextInt();
       sc.close();
       // this is conditional statements
       if(i > 0) {
           System.out.println("number is positive!"); // block of code
       }
       else {
           System.out.println("Number is negative!");
       }
   }
}
