import java.util.Set;
import java.util.TreeSet;

public class Supervisor extends Employee {

    private boolean isWatching;
    private Set<Employee> employees = new TreeSet<>();

    public Supervisor(String name, int age) {
        super(name, age);
    }

    public void addWatch(Employee employee) {
        employees.add(employee);
    }

    public boolean isWatching(Employee employee) {
        return employees.contains(employee);
    }
    public Set<Employee> isWatching() {
        return employees;
    }

    public void talk() {
        if (isWatching) {
            System.out.println("I got to do. I can't watch");
        } else {
            System.out.println("Everyone works, I guess");
        }
    }

    public void shoutAt(Employee employee) {
        System.out.println("WHAT ARE YOU DOING, " + employee.getName().toUpperCase() + "? WE GOTTA WORK!!");
    }

    public void talkAbout(Employee employee) {
        if (employee.isWorking()) {
            System.out.println(this.getName() + " is watching " + employee.getName() + " while he works.");
        } else {
            shoutAt(employee);
        }
    }
}
