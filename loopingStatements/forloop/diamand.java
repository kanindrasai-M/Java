package loopingStatements.forloop;
import java.util.Scanner;

public class diamand {
    public static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int j=1; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=n;j>i; j--) {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        display();
    }
}
