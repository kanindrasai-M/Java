package conditonalStatements;
import java.util.Scanner;

public class Excersie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //object
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Enter c value: ");
        int c = sc.nextInt();

        double result = b * b - 4 * a * c;

        if (result > 0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result,0.5)) / (2.0 * a);
            System.out.println("The roots are: "+r1+","+r2+" ");
        }
        else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is: "+r1);
        }
        else{
            System.out.println("The Equation has no real roots!");
        }
    }
}
