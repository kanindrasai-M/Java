package com.basic_programs;

// This program is writing based on Swapping of two numbers
public class swappingToNumbers {
    public static void main(String[] args) {
        int a,b,temp;
        a = 20;
        b = 40;
        // before swapping two numbers
        System.out.println("Before Swapping Numbers");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // After Swapping two numbers
        /*
         Swapping technique is created one variable is temporary as temp.
         temp variable we stored value of a
         for a variable we stored value of b
         for b variable we stored from temp variable which we have stored from a variable
         */
        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
