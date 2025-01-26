public class Student {

    private String name;
    private int id;

    public Student(String nm, int i) {
        name = nm;
        id = i;
    }

    private double calculatedSGPA() {
        System.out.println("Private method executed -> ");
        return 4.00;
    }

    public void showDetails() {
        double sg = calculatedSGPA();
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
        System.out.println("SGPA -> " + sg);
    }
}