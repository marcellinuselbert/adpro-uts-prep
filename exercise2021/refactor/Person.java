package exercise2021.refactor2.refactor;

abstract class Person {
    public String id = null;
    public String address = null;
    public String name = null;
    public double salary = 0.0;

    Person(String id, String addr, String name) {
        this.id = id;
        this.address = addr;
        this.name = name;
    }

    public String getID() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void study();

    public abstract void work();
}
