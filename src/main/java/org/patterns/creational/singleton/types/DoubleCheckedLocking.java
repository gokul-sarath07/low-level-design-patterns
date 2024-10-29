package org.patterns.creational.singleton.types;

public class DoubleCheckedLocking {
    // Step 1: Private static volatile variable of the single instance
    private static volatile DoubleCheckedLocking instance;

    // Step 2: Private constructor to prevent instantiation
    private DoubleCheckedLocking() {}

    // Step 3: Public method to provide access to the instance
    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            // Step 4: Synchronized to make it thread-safe
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking(); // create the instance if it doesn’t exist
                }
            }
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Double Checked Locking Singleton, instance says hello!");
    }
}
