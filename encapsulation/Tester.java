public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("carel", 6);
        Student s2 = new Student("cara", 4);
        s2.setId(99);
        s2.showDetails();
        System.out.println(s2.getName());
        s2.setId(10);
        System.out.println(s2.getId());
        System.out.println(s1.getName());
        s1.setName("Bob");
        System.out.println(s1.getName());
    }
}