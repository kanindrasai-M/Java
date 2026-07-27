package conditonalStatements;
import java.util.Scanner;

public class switchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) { // while loop is true and until false
            System.out.println("==================================================================================");
            System.out.printf("1.Add");
            System.out.printf("\n2.Sub");
            System.out.printf("\n3.Mul");
            System.out.printf("\n4.Div");
            System.out.printf("\n5.Exit");
            System.out.printf("\nChoose any option: ");
            int choice = sc.nextInt();
            switch (choice) { // this is switch conditional statements
                case 1:
                    System.out.printf("Enter 1st Number: ");
                    int a = sc.nextInt();
                    System.out.printf("Enter 2nd Number: ");
                    int b = sc.nextInt();
                    int add = a + b;
                    System.out.printf("Sum = %d\n", add);
                    break;
                case 2:
                    System.out.printf("Enter 1st Number: ");
                    int c = sc.nextInt();
                    System.out.printf("Enter 2nd Number: ");
                    int d = sc.nextInt();
                    int sub = c - d;
                    System.out.printf("Sub = %d\n", sub);
                    break;
                case 3:
                    System.out.printf("Enter 1st Number: ");
                    int e = sc.nextInt();
                    System.out.printf("Enter 2nd Number: ");
                    int f = sc.nextInt();
                    int Mul = e * f;
                    System.out.printf("Mul = %d\n", Mul);
                    break;
                case 4:
                    System.out.printf("Enter 1st Number: ");
                    int g = sc.nextInt();
                    System.out.printf("Enter 2nd Number: ");
                    int h = sc.nextInt();
                    int div = g / h;
                    System.out.println("div = " + div);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
    }
}