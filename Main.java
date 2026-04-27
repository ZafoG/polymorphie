public class Main {

    public static void main(String[] args) {

        // --- Employees erstellen ---
        Employee e1 = new Employee("Alice", 25);
        Employee e2 = new Employee("Bob", 30);
        Employee e3 = new Employee("Charlie", 28);

        // --- Supervisor erstellen ---
        Supervisor sup = new Supervisor("David", 40);

        System.out.println("=== BASIC INFOS ===");
        e1.getID();
        e2.getID();

        System.out.println("\n=== GETTER / SETTER ===");
        e1.setName("Alicia");
        e1.setAge(26);
        System.out.println(e1.getName() + " is now " + e1.getAge());

        System.out.println("\n=== WORK STATUS ===");
        e1.isWorking(); // sollte "nichts zu tun" sagen
        e1.work();
        e1.isWorking(); // sollte "working" sagen

        System.out.println("\n=== TALK ===");
        e1.talk();
        e2.talk();

        System.out.println("\n=== EQUALS / HASHCODE ===");
        Employee e4 = new Employee("Alicia", 26);
        System.out.println("e1 equals e4? " + e1.equals(e4));
        System.out.println("e1 hash: " + e1.hashCode());
        System.out.println("e4 hash: " + e4.hashCode());

        System.out.println("\n=== SUPERVISOR FEATURES ===");

        // Employees zuweisen
        sup.addWatch(e1);
        sup.addWatch(e2);

        System.out.println("Supervisor watching e1? " + sup.isWatching(e1));
        System.out.println("Supervisor watching e3? " + sup.isWatching(e3));

        System.out.println("\n=== SUPERVISOR WORK ===");
        sup.isWorking();

        System.out.println("\n=== SUPERVISOR TALK ===");
        sup.talk();

        System.out.println("\n=== SHOUTING ===");
        sup.shoutAt(e2);

        System.out.println("\n=== TALK ABOUT EMPLOYEES ===");
        sup.talkAbout(e1); // arbeitet
        sup.talkAbout(e3); // arbeitet nicht

        System.out.println("\n=== WATCH LIST ===");
        for (Employee e : sup.getWatchedEmployees()) {
            System.out.println("Watching: " + e.getName());
        }

        System.out.println("\n=== POLYMORPHIE TEST ===");

        Employee poly = new Supervisor("Eve", 50);

        poly.talk();        // sollte Supervisor.talk() aufrufen
        poly.isWorking();   // sollte Supervisor.isWorking() aufrufen
    }
}