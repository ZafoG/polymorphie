public class Main {

    public static void main(String[] args) {
        
        Supervisor s1 = new Supervisor("Mehmet", 23);
        Supervisor s2 = new Supervisor("Zafo", 28);

        Employee e1 = new Employee("Dominik", 18);
        Employee e2 = new Employee("Marcel", 25);

        s1.talkAbout(e1);
    }
    
}
