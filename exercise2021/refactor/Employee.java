package exercise2021.refactor2.refactor;

class Employee extends Person {

    public double salary = 0.0;

    public Employee(String id, String name, String addr, double sal) {
        super(id, addr, name);
        this.salary = sal;
    }

    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name
                + ", Address: " + this.address + ", Salary: " + this.salary;
    }

    public double getSalary() {
        if (isPalindrome(this.name)) {
            return 1.25 * this.salary;
        } else {
            return this.salary;
        }
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public static boolean isPalindrome(String name) {
        boolean palindrome = false;

        if (name.length() % 2 == 0) {
            for (int i = 0; i < name.length() / 2 - 1; i++) {
                if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        } else {
            for (int i = 0; i < (name.length() - 1) / 2 - 1; i++) {
                if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        }

        return palindrome;
    }

    public void study() {
        System.out.println("Study the advanced technology for industry to earn money");
    }

    public void work() {
        System.out.println("Works on office tasks to make the job done as soon as possible");
    }

}
