public class Employee {

    private String name;
    private int age;
    private boolean isWorking;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getID() {
        System.out.println("My name is " + this.getName() + " and I am " + this.getAge());
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println(this.age);
        return this.age;
    }

    public boolean isWorking() {

        if (isWorking) {
            System.out.println("I am working");
        } else {
            System.out.println("I got nothing to do");
        }
        

        return isWorking;
    }

    public void talk() {
        if (!isWorking) {
            System.out.println("My name is " + this.name + " and I am an employee");
        } else {
            System.out.println("I am employee " + this.name + " and I am currently working");
        }
    }

    public void work() {
        System.out.println(name + " just started working..");

        isWorking = true;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Employee e)) return false;
        return (this.getName() == e.getName()) && (this.getAge() == e.getAge());
    }

    @Override
    public int hashCode() {
        return this.getAge() * 31;
    }
}