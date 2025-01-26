public class Tester {
    public static void main(String[] args) {
        System.out.println("Total Student Count-> " + Student.count);
        Student s1 = new Student("carel", 6);
        Student s2 = new Student("cara", 4);
        Student s3 = new Student("rain", 8);
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        // System.out.println("Total Student Count-> " + s1.count);
        System.out.println("Total Student Count-> " + Student.count);
    }
}