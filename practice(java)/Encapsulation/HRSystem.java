class Employee {
    private final int employeeID; 
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }


    public int getEmployeeID() {
        return employeeID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getFormattedSalary() {
        return String.format("$%,.2f", salary);
    }
}

public class HRSystem {
    public static void main(String[] args) {
        Employee emp = new Employee(5001, "John Doe", 85000.75);

        System.out.println("Employee ID: " + emp.getEmployeeID());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: " + emp.getFormattedSalary());

        // Updating the name via setter
        emp.setName("John Smith");
        System.out.println("Updated Name: " + emp.getName());
        
    }
}
