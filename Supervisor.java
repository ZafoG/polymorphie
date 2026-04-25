import java.util.HashSet;
import java.util.Set;

public class Supervisor extends Employee {

    private boolean isWatching;
    private Set<Employee> employees = new HashSet<>();

    public Supervisor(String name, int age) {
        super(name, age);
    }

    public boolean getIsWatching() {
        return isWatching;
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

    public boolean isWorking() {

        boolean irgendwas = false;

        if (this.employees.isEmpty()) {
            System.out.println("I should do something");
        } else {
            for (Employee object : this.employees) {
                object.getName();
            }
            irgendwas = true;
        }

        System.out.println("Those are my employees");
        return irgendwas;
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
