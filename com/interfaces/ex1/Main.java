package com.interfaces.ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("==================================================================");
            System.out.println("1.Circle Area");
            System.out.println("2.Triangle Area");
            System.out.println("3.Rectangle Area");
            System.out.println("4.Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter circle radius: ");
                    double r = sc.nextDouble();

                    Circle circle = new Circle(r);
                    System.out.println("Area of circle: " + circle.getArea());

                    break;
                case 2:
                    System.out.println("Enter length: "); // Triangle length
                    double l = sc.nextDouble();

                    System.out.println("Enter breadth: "); // Triangle breadth
                    double b = sc.nextDouble();

                    Triangle triangle = new Triangle(l, b); // Triangle Reference
                    System.out.println("Area of Triangle: " + triangle.getArea());

                    break;
                case 3:
                    System.out.println("Enter length: ");
                    double L = sc.nextDouble();

                    System.out.println("Enter breadth: ");
                    double B = sc.nextDouble();

                    Rectangle rectangle = new Rectangle(L, B);

                    System.out.println("Area of Rectangle: " + rectangle.getArea());
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input! please try again!");
                    break;
            }
        }

    }
}
