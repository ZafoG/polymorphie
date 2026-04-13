public class Employee {

    private String name;
    private int age;
    private boolean isWorking;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isWorking() {
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

    public static void main(String[] args) {
        Employee m1 = new Employee("Jason", 18);
        Employee m2 = new Employee("Mason", 36);

        m1.getAge();
        m1.work();
        m1.talk();

        m2.getAge();
        m2.talk();
    }
}