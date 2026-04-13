public class Supervisor extends Employee{

    private String name;
    private int age;
    private boolean isWatching;

    public Supervisor(String name, int age) {
        super(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void talk() {
        if (!isWatching) {
            System.out.println("I got to do. I can't watch");
        } else {
            System.out.println("Everyone works");
        }
    }

    public void talkAbout(Employee employee) {
        if (employee.)
    }
    
}
