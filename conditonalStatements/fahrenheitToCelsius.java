package conditonalStatements;
import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();

        Temparature temp = new Temparature();
        temp.setFahrenheit(f);

        System.out.println(temp.getFahrenheit() + " degree Fahrenheit is equal to "
                + temp.toCelsius() + " in Celsius");

        sc.close();
    }
}
