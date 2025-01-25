public class Student {

    public String name;
    private int id;

    public Student(String nm, int i) {
        name = nm;
        id = i;
    }

    public void updateId(int i) {
        if (i > 0) {
            id = i;
        } else {
            System.out.println("Invalid id given");
        }
    }

    public void showDetails() {
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
    }
}