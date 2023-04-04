package exercise2021.refactor2.refactor;

public class Student extends Person {

    public double GPA = 0.0;

    public Student(String id, String name, String addr, double gpa) {
        super(id, addr, name);
        this.GPA = gpa;
    }

    public double getGPA() {
        return this.GPA;
    }

    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name
                + ", Address: " + this.address + ", GPA: " + this.GPA;
    }

    public void study() {
        System.out.println("Study basic science and technology to obtain degree");
    }

    public void work() {
        System.out.println("Works on campus assignments before the deadlines come due");
    }

}
