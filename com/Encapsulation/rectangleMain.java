package com.Encapsulation;
import java.util.Scanner;

public class rectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Rectangle height: ");
        double $heigth = sc.nextDouble();
        System.out.println("Rectangle width: ");
        double $width = sc.nextDouble();
        rectangle.setHeight($heigth);
        rectangle.setWidth($width);

        double height = rectangle.getHeight();
        double width = rectangle.getWidth();

        System.out.println("Height: "+height);
        System.out.println("Weight: "+width);

    }
}
