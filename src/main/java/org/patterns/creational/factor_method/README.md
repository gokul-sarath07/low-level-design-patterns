# Factory Method Design Pattern

The Factory Method Design Pattern is widely used in object-oriented design to create objects, particularly valuable when the exact class of the object might change at runtime. This README provides a step-by-step guide to understanding and implementing this pattern.

## 1. Problem Overview

Imagine you're building a system where different types of vehicles (e.g., car, truck, and bike) need to be created based on user input or configuration. A straightforward approach might involve using a conditional structure (e.g., an `if-else` block) to create each type of vehicle. However, this approach has limitations:

- **Maintenance Difficulty**: Adding a new vehicle type requires modifying the conditional structure, making the code harder to maintain.
- **Violation of the Open/Closed Principle**: This principle from SOLID design suggests that code should be open for extension but closed for modification. With a conditional approach, we must modify the code each time a new vehicle type is introduced.

The Factory Method Pattern solves these issues by delegating the object creation responsibility to subclasses.

## 2. What is the Factory Method Pattern?

The Factory Method Pattern provides a way to delegate instantiation logic to subclasses, rather than having it tightly coupled within a base class or the main program flow. It defines an interface for creating an object but lets subclasses decide which class to instantiate.

### Key Points:
- **Dependency on Abstractions**: The pattern encourages depending on interfaces or abstract classes rather than concrete classes.
- **Subclasses Override Factory Method**: Subclasses override the factory method to create specific types of objects.

## 3. Simple Analogy

Consider a bakery that produces various baked goods—cakes, bread, cookies—each requiring different ingredients and preparation methods. Instead of baking each type in the same method, the bakery has specialized areas and staff experts for each type. When you ask for a baked item, you only care about receiving your desired item, not how it's made.

In a similar way, the Factory Method hides the details of object creation, delegating the responsibility to subclasses to decide what specific object to produce.

## 4. Structure of Factory Method Pattern

The Factory Method Pattern consists of the following components:

- **Creator**: Defines an abstract factory method that subclasses implement.
- **Concrete Creator**: Extends the `Creator` class and overrides the factory method to create specific product instances.
- **Product**: An interface or abstract class that defines the structure of objects created by the factory method.
- **Concrete Products**: Classes implementing the `Product` interface, created by the factory method.


## 5. Explanation of the Example

In this setup:

- **VehicleFactory** defines a `createVehicle()` method, which serves as the factory method.
- **CarFactory** and **TruckFactory** are specific factories (concrete creators) that implement `createVehicle()` to return specific types of vehicles.
- **Main** uses these factories without concerning itself with the details of object creation—Main only interacts with **VehicleFactory**.

This way, if you want to add another vehicle (say, **Bike**), you only need to add a **Bike** class and a **BikeFactory** without modifying the existing code.

## 6. When to Use the Factory Method Pattern

Use this pattern when:

- You need to create objects based on dynamic conditions.
- You want to centralize object creation but maintain flexibility for future extensions.
- Your application benefits from following the **Open/Closed Principle**, allowing code to be extended without modifying existing code.

## 7. Advantages and Disadvantages

**Advantages:**

- Promotes code reusability and flexibility.
- Decouples client code from specific classes, promoting modularity.

**Disadvantages:**

- Can add complexity with additional classes.
- If overused, it can lead to an excessive number of classes.

## 8. Wrapping Up

The Factory Method is a powerful pattern for managing object creation dynamically while maintaining loose coupling. It’s especially useful in low-level design scenarios where you want to make a system flexible and adaptable to future changes without disturbing existing code.