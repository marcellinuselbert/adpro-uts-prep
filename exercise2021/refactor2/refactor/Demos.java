package exercise2021.refactor2.refactor;

public class Demos {

    public static void main(String[] args) {
        Person person1 = new Employee("Staff501", "Arifin", "Jakarta", 5000);
        Person person2 = new Student("Student501", "Budianto", "Bandung", 3.01);
        System.out.println(person1.toString());
        person1.study();
        person1.work();
        System.out.println(person2.toString());
        person2.study();
        person2.work();
        person2 = new Employee("Staff502", "Budianto", "Bandung", 3900);
        System.out.println(person2.toString());
        person2.study();
        person2.work();
    }

}
