public class Student extends Person {
    private double gpa;

    public String toString() {
        return "Student: " + super.toString();
    }

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = (double)gpa;
    }

    public double getPaymentAmount() {
        return this.gpa > 2.67 ? (double)36660.0F : (double)0.0F;
    }
}