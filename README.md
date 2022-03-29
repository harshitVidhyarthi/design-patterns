# design-patterns

1. Introduction
In software engineering, a Design Pattern describes an established solution to the most commonly encountered problems in software design. It represents the best practices evolved over a long period through trial and error by experienced software developers.

Design Patterns gained popularity after the book Design Patterns: Elements of Reusable Object-Oriented Software was published in 1994 by Erich Gamma, John Vlissides, Ralph Johnson, and Richard Helm (also known as Gang of Four or GoF).

In this article, we'll explore creational design patterns and their types. We'll also look at some code samples and discuss the situations when these patterns fit our design.

2. Creational Design Patterns
Creational Design Patterns are concerned with the way in which objects are created. They reduce complexities and instability by creating objects in a controlled manner.

The new operator is often considered harmful as it scatters objects all over the application. Over time it can become challenging to change an implementation because classes become tightly coupled.


freestar
Creational Design Patterns address this issue by decoupling the client entirely from the actual initialization process.

In this article, we'll discuss four types of Creational Design Pattern:

Singleton – Ensures that at most only one instance of an object exists throughout application
Factory Method – Creates objects of several related classes without specifying the exact object to be created
Abstract Factory – Creates families of related dependent objects
Builder – Constructs complex objects using step-by-step approach
Let's now discuss each of these patterns in detail.

3. Singleton Design Pattern
The Singleton Design Pattern aims to keep a check on initialization of objects of a particular class by ensuring that only one instance of the object exists throughout the Java Virtual Machine.

A Singleton class also provides one unique global access point to the object so that each subsequent call to the access point returns only that particular object.


freestar
3.1. Singleton Pattern Example
Although the Singleton pattern was introduced by GoF, the original implementation is known to be problematic in multithreaded scenarios.

So here, we're going to follow a more optimal approach that makes use of a static inner class:

public class Singleton  {    
    private Singleton() {}
    
    private static class SingletonHolder {    
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {    
        return SingletonHolder.instance;    
    }
}
Here, we've created a static inner class that holds the instance of the Singleton class. It creates the instance only when someone calls the getInstance() method and not when the outer class is loaded.

This is a widely used approach for a Singleton class as it doesn’t require synchronization, is thread safe, enforces lazy initialization and has comparatively less boilerplate.

Also, note that the constructor has the private access modifier. This is a requirement for creating a Singleton since a public constructor would mean anyone could access it and start creating new instances.


freestar
Remember, this isn't the original GoF implementation. For the original version, please visit this linked Baeldung article on Singletons in Java.

3.2. When to Use Singleton Design Pattern
For resources that are expensive to create (like database connection objects)
It's good practice to keep all loggers as Singletons which increases performance
Classes which provide access to configuration settings for the application
Classes that contain resources that are accessed in shared mode
4. Factory Method Design Pattern
The Factory Design Pattern or Factory Method Design Pattern is one of the most used design patterns in Java.

According to GoF, this pattern “defines an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses”.

This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.

To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.

4.1. Factory Method Design Pattern Example
In this example, we'll create a Polygon interface which will be implemented by several concrete classes. A PolygonFactory will be used to fetch objects from this family:


Let's first create the Polygon interface:

public interface Polygon {
    String getType();
}
Next, we'll create a few implementations like Square, Triangle, etc. that implement this interface and return an object of Polygon type.


freestar
Now we can create a factory that takes the number of sides as an argument and returns the appropriate implementation of this interface:

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        }
        if(numberOfSides == 4) {
            return new Square();
        }
        if(numberOfSides == 5) {
            return new Pentagon();
        }
        if(numberOfSides == 7) {
            return new Heptagon();
        }
        else if(numberOfSides == 8) {
            return new Octagon();
        }
        return null;
    }
}
Notice how the client can rely on this factory to give us an appropriate Polygon, without having to initialize the object directly.

4.2. When to Use Factory Method Design Pattern
When the implementation of an interface or an abstract class is expected to change frequently
When the current implementation cannot comfortably accommodate new change
When the initialization process is relatively simple, and the constructor only requires a handful of parameters
5. Abstract Factory Design Pattern
In the previous section, we saw how the Factory Method design pattern could be used to create objects related to a single family.

By contrast, the Abstract Factory Design Pattern is used to create families of related or dependent objects. It's also sometimes called a factory of factories.

For a detailed explanation, check out our Abstract Factory tutorial.

6. Builder Design Pattern
The Builder Design Pattern is another creational pattern designed to deal with the construction of comparatively complex objects.

When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

This builder can then be used to create many other similar representations using a simple step-by-step approach.


freestar
6.1. Builder Pattern Example
The original Builder Design Pattern introduced by GoF focuses on abstraction and is very good when dealing with complex objects, however, the design is a little complicated.

Joshua Bloch, in his book Effective Java, introduced an improved version of the builder pattern which is clean, highly readable (because it makes use of fluent design) and easy to use from client's perspective. In this example, we'll discuss that version.

This example has only one class, BankAccount which contains a builder as a static inner class:

public class BankAccount {
    
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    // constructors/getters
    
    public static class BankAccountBuilder {
        // builder code
    }
}
Note that all the access modifiers on the fields are declared private since we don't want outer objects to access them directly.

The constructor is also private so that only the Builder assigned to this class can access it. All of the properties set in the constructor are extracted from the builder object which we supply as an argument.

We've defined BankAccountBuilder in a static inner class:

public static class BankAccountBuilder {
    
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;
    
    public BankAccountBuilder(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public BankAccountBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public BankAccountBuilder wantNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
        return this;
    }
    
    public BankAccount build() {
        return new BankAccount(this);
    }
}
Notice we've declared the same set of fields that the outer class contains. Any mandatory fields are required as arguments to the inner class's constructor while the remaining optional fields can be specified using the setter methods.

This implementation also supports the fluent design approach by having the setter methods return the builder object.

Finally, the build method calls the private constructor of the outer class and passes itself as the argument. The returned BankAccount will be instantiated with the parameters set by the BankAccountBuilder.

Let's see a quick example of the builder pattern in action:

BankAccount newAccount = new BankAccount
  .BankAccountBuilder("Jon", "22738022275")
  .withEmail("jon@example.com")
  .wantNewsletter(true)
  .build();
6.2. When to Use Builder Pattern
When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
When an increase in the number of constructor parameters leads to a large list of constructors
When client expects different representations for the object that's constructed
7. Conclusion
In this article, we learned about creational design patterns in Java. We also discussed their four different types, i.e., Singleton, Factory Method, Abstract Factory and Builder Pattern, their advantages, examples and when should we use them.
