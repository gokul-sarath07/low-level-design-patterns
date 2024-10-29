package org.patterns.creational.singleton.types;

public class EagerInitialization {
    // Step 1: Private static final variable of the single instance
    private static final EagerInitialization instance = new EagerInitialization();

    // Step 2: Private constructor to prevent instantiation
    private EagerInitialization() {}

    // Step 3: Public method to provide access to the instance
    public static EagerInitialization getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Initialized Singleton, instance says hello!");
    }
}
