package loopingStatements.forloop;

public class InvertedTriangle {
    public static void display() {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        display();
    }
}
