public class Student {

    public String name;
    public int id;

    public Student(String nm, int i) {
        name = nm;
        id = i;
    }

    public void showDetails() {
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
        System.out.println("------------------------------");
    }
}