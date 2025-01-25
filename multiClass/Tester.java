public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("cara", 1);
        Student s2 = new Student("Bob", 2);
        Course c1 = new Course("SE221", "ood");
        Course c2 = new Course("SE222");
        s1.addCourse(c1);
        s1.addCourse(c2);

        s1.showDetails();
    }
}
