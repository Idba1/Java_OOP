public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("carel", 6);
        Student s2 = new Student("cara", 4);
        // s2.id = 77;
        s2.showDetails();
        s2.updateId(-7);
        s2.updateId(77);
        s2.showDetails();
        s1.showDetails();
    }
}