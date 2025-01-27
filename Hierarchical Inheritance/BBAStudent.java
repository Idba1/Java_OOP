public class BBAStudent extends Student {

    public BBAStudent(String nm, int id) {
        super(nm, id);
    }

    public void party() {
        System.out.println("All day party");
    }

    public void doClass() {
        System.out.println(name + " doing theory class");
        System.out.println("------------------------------");
    }
}
