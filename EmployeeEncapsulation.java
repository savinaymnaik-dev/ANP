class Employee {

    private int id;
    private double salary;
    private String designation;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

public class EmployeeEncapsulation {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(01);
        e.setSalary(5000.0);
        e.setDesignation("Software Engineer");

       
        System.out.println("Employee ID        : " + e.getId());
        System.out.println("Employee Salary    : " + e.getSalary());
        System.out.println("Employee Designation: " + e.getDesignation());
    }
}
