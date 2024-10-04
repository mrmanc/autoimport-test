package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // pasting the line below or performing optimise imports should cause IntelliJ to automatically add a static import for Source.thisShouldBeVisible()
        thisShouldBeVisible();
    }
}