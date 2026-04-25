public class Main {

    public static void main(String[] args) {

        Supervisor s1 = new Supervisor("Mehmet", 23);
        Supervisor s2 = new Supervisor("Manuel", 28);

        Employee e1 = new Employee("Dominik", 18);
        Employee e2 = new Employee("Marcel", 25);

        e1.getID();
        e2.getID();

        s1.getID();
        s2.getID();

        System.out.println("\n");

        System.out.println(e1.getName() + " " + e1.getAge());
        System.out.println(e2.getName() + " " + e2.getName());
        System.out.println("-----------");
        System.out.println(s1.getName() + " " + s1.getAge());
        System.out.println(s2.getName() + " " + s2.getAge());

        System.out.println("\n");

    }
}
