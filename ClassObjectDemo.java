class Student { 
    // Data members (Encapsulation) 
    private int rollNo; 
    private String name; 
 
    // Constructor to initialize object 
    Student(int rollNo, String name) { 
        this.rollNo = rollNo; 
        this.name = name; 
    } 
 
    // Method to display student details 
    void displayDetails() { 
        System.out.println("Roll No: " + rollNo + ", Name: " + name); 
    } 
} 
 
public class ClassObjectDemo { 
    public static void main(String[] args) { 
        // Creating objects using new keyword 
        Student s1 = new Student(101, "Aarav"); 
        Student s2 = new Student(102, "Soham"); 
 
        // Calling method using objects 
        s1.displayDetails(); 
        s2.displayDetails(); 
    } 
}

