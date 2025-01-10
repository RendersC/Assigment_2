public class Employee extends Person {
    private String position;
    private double salary;

    public String toString() {
        return "Employee: " + super.toString();
    }

    public Employee() {
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return this.salary;
    }
}