class Calculator { 
    int a, b; 
    // Default constructor 
    Calculator() { 
        a = 0; 
        b = 0; 
        System.out.println("Default Constructor: a = " + a + ", b = " + b); 
    } 
    // Parameterized constructor with one argument 
    Calculator(int x) { 
        a = x; 
        b = 0; 
        System.out.println("Constructor with one parameter: a = " + a + ", b = " + b); 
    } 
    // Parameterized constructor with two arguments 
    Calculator(int x, int y) { 
        a = x; 
        b = y; 
        System.out.println("Constructor with two parameters: a = " + a + ", b = " + b); 
    } 
    // Method Overloading - add() methods 
    int add(int x, int y) { 
        return x + y; 
    } 
  double add(double x, double y) { 
        return x + y; 
    } 
    int add(int x, int y, int z) { 
        return x + y + z; 
    } 
} 
public class OverloadingDemo { 
    public static void main(String[] args) { 
        // Demonstrating Constructor Overloading 
        Calculator c1 = new Calculator(); 
        Calculator c2 = new Calculator(10); 
        Calculator c3 = new Calculator(10, 20); 
 
        // Demonstrating Method Overloading 
        System.out.println("Addition of two integers: " + c3.add(5, 10)); 
        System.out.println("Addition of two doubles: " + c3.add(2.5, 3.7)); 
        System.out.println("Addition of three integers: " + c3.add(1, 2, 3)); 
    } 
}