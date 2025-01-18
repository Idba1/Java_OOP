public class Tester {
    public static void main(String[] args) {
        // className Variable = new className()
        Student s1 = new Student();
        s1.name = "Bob";
        s1.id = 90;
        s1.clubName = "Cyber Security";
        Student s2 = new Student();
        s2.name = "Carel";
        s2.id = 80;
        s2.clubName = "Data Science";
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s2.name);
        // System.out.println(s2.id);
        // s1.duingClass();
        // s2.clubActivity("Cyber Security");
        s1.showDetail();
        System.out.println("--------------------------");
        s2.showDetail();
    }
}
