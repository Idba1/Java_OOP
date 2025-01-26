public class Student {

    private String name;
    private int id;

    public Student(String nm, int i) {
        name = nm;
        id = i;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        if (i > 0) {
            id = i;
        } else {
            System.out.println("Invalid id given");
        }
    }

    public int getId() {
        return id;
    }

    public void showDetails() {
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
    }
}