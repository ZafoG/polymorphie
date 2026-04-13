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

    public void shoutAt(Employee employee) {
        System.out.println("WHAT ARE YOU DOING? WE GOTTA WORK!!");
    }

    public void talkAbout(Employee employee) {
        if (employee.isWorking()) {
            System.out.println("I am watching " + employee.getName() + " while he works.");
        } else {
            shoutAt(employee);
        }
    }
    
    public static void main(String[] args) {
        Supervisor s1 = new Supervisor("Mehmet", 23);

        s1.talkAbout(m1);
    }
}
