public class Employee {
    private String name;
    private double salary;

    /*
     * Constructor.
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getAnnualIncome() {
        // Employees only get an annual salary.
        return getSalary();
    }
}

public class Manager extends Employee {
    double bonus;
    public Manager(String name, double salary, double bonus) {
        //use super to initialize parent class constructors, followed by the new "bonus" addon
        super(name);
        super(salary);
        this.bonus = bonus;
    }
    double returnIncome() {
        return getSalary() + bonus;
    }
}