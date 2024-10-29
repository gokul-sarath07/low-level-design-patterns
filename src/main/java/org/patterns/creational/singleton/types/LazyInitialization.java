package org.patterns.creational.singleton.types;

public class LazyInitialization {
    // Step 1: Private static variable of the single instance
    private static LazyInitialization instance;

    // Step 2: Private constructor to prevent instantiation
    private LazyInitialization() {}

    // Step 3: Public method to provide access to the instance
    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization(); // create the instance if it doesn’t exist
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Initialized Singleton, instance says hello!");
    }
}
