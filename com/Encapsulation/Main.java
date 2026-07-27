package com.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // created instance

        // set values
        person.setName("Sai");
        person.setAge(21);
        person.setCountry("India");

        // get values
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        // printing values
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);
    }
}
