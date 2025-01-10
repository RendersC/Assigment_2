public class Person implements Payable, Comparable<Person> {
    private static int NextID = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = NextID++;
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    public Person(String name, String surname) {
        this.id = NextID++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return this.id + ". " + this.name + " " + this.surname;
    }

    public String getPosition() {
        return "Student";
    }

    public double getPaymentAmount() {
        return (double)0.0F;
    }

    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}