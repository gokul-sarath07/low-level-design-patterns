package org.patterns.creational.singleton;

import org.patterns.creational.singleton.types.DoubleCheckedLocking;
import org.patterns.creational.singleton.types.EagerInitialization;
import org.patterns.creational.singleton.types.LazyInitialization;
import org.patterns.creational.singleton.types.LazyInitializationWithSynchronization;

// Client code
// this could be code from different application or from a different module.
public class Client {
    public static void singleton() {
        LazyInitialization instance1 = LazyInitialization.getInstance();
        instance1.showMessage();

        LazyInitializationWithSynchronization instance2 = LazyInitializationWithSynchronization.getInstance();
        instance2.showMessage();

        DoubleCheckedLocking instance3 = DoubleCheckedLocking.getInstance();
        instance3.showMessage();

        EagerInitialization instance4 = EagerInitialization.getInstance();
        instance4.showMessage();
    }
}
