package com.interfaces.sample;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.cut();
        lenovo.keyboard();
        lenovo.security();

        Apple apple = new Apple();
        apple.copy();
        apple.paste();
        apple.cut();
        apple.keyboard();
        apple.security();
    }
}
