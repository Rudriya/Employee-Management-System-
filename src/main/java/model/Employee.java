package model;

public class Employee {
    private int id;
    private String name;
    private String email;         // ✅ Add this field
    private String department;
    private int age;
    private double salary;

    // Default constructor
    public Employee() {}

    // Constructor for full employee details
    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Constructor used when fetching limited data (e.g., from a simpler query)
    public Employee(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;          // ✅ This line works now
        this.department = department;
    }

    // Getters and setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
