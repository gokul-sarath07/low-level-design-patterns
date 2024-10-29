package org.patterns.creational.singleton.types;

public class LazyInitializationWithSynchronization {
    // Step 1: Private static variable of the single instance
    private static LazyInitializationWithSynchronization instance;

    // Step 2: Private constructor to prevent instantiation
    private LazyInitializationWithSynchronization() {}

    // Step 3: Public method to provide access to the instance
    // Step 4: Synchronized to make it thread-safe
    public static synchronized LazyInitializationWithSynchronization getInstance() {
        if (instance == null) {
            instance = new LazyInitializationWithSynchronization(); // create the instance if it doesn’t exist
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Initialized Singleton with Synchronized, instance says hello!");
    }
}
