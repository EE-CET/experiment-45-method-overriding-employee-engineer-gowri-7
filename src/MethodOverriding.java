class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
    // Override display() method
    void display() {
        System.out.println("Name of class is Engineer");
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Create an Engineer object
        Engineer e = new Engineer();

        // Call the display() method
        e.display();
    }
}
