public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("carel", 6);
        Student s2 = new Student("cara", 4);
        Student s3 = new Student("rain", 8);
        Student.updateUniName("Daffodil International University");
        System.out.println(Student.courseTitle);
        // Student.courseTitle = "OOD Project";
        Student.updateCourse("OOD Project");
        s1.showDetails();
        Student.updateCourse("OOC");
        s2.showDetails();
        s3.showDetails();
        Student.updateUniName("DIU");
        System.out.println(Student.uniName);
    }
}