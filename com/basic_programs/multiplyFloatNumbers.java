package com.basic_programs;
import java.util.Scanner;
// here we are doing operations on multiplying floating numbers
public class multiplyFloatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number: ");
        float num2 = sc.nextFloat();

        sc.close();
        float add = num1 + num2;
        System.out.println("The sum of floating Numbers: "+add);

    }
}
