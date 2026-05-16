package com.innerclasses;

public class Outer1 {
    private static String msg = "Hello from Static Nested Class";

    static class Nested {
        void display() {
            System.out.println(msg);  // Only static members of outer class are accessible
        }
    }

    public static void main(String[] args) {
        Outer1.Nested nested = new Outer1.Nested();  // No outer object needed
        nested.display();
    }
}

