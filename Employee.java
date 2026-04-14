public class Employee {

    private String name;
    private int age;
    private boolean isWorking;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println(this.age);;
    }

    public boolean isWorking() {

        if (isWorking) {
            System.out.println("I am working");
        } else {
            System.out.println("I got nothing to do");
        }
        ;

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
}