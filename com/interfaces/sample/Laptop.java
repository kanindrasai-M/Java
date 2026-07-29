package com.interfaces.sample;

public interface Laptop {
    public void copy();

    public void paste();

    public void cut();

    public void keyboard();

    default void security() {
        System.out.println("Security provided");
        audio();
        capture();
    }

    static void audio() {
        System.out.println("Laptop provided audio");
    }

    private static void capture() {
        System.out.println("Laptop provided camera function");
    }
}
