public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 1);
        SWEStudent swe1 = new SWEStudent("Carel", 2, 3);
        swe1.showDetails();
        swe1.cry();
        System.out.println("------------------");
        BBAStudent bba1 = new BBAStudent("yungchi", 9);
        bba1.showDetails();
        bba1.doClass();
        bba1.party();
    }
}
