public class Mitarbeiter {

    private String name;
    private String age;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    public getAge() {
        return age;
    }

    public void talk() {
        System.out.println("Ich bin Mitarbeiter " + name);
    }

    public void work() {
        System.out.println(name + " just started working..");
    }
}