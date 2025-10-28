// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Multiple Inheritance using Interfaces
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Interface A implemented");
    }

    public void showB() {
        System.out.println("Interface B implemented");
    }
}

// Method Overriding (Runtime Polymorphism)
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    // Overriding run() method
    void run() {
        System.out.println("Bike is running safely");
    }
}

// Main class with Exception Handling
public class InheritanceDemo {
    public static void main(String[] args) {

        // Single Inheritance Example
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance Example
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        // Multiple Inheritance using Interfaces
        C obj = new C();
        obj.showA();
        obj.showB();

        // Method Overriding (Runtime Polymorphism)
        Vehicle v = new Bike(); // upcasting
        v.run();

        // Exception Handling
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
