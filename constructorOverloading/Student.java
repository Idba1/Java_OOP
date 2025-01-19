public class Student {
    public String name; // instance variable
    public int id;
    public double cgpa;

    public Student() { // same name as the class name
        System.out.println("no parameter");
        System.out.println("-----------------------------");
    }

    public Student(String name, int id) { // same name as the class name
        System.out.println("with 2 parameter");
        this.name = name;
        this.id = id;
        System.out.println(name + " " + id);
        System.out.println("-----------------------------");
    }

    public Student(String name, int id, double cgpa) { // same name as the class name
        System.out.println("with 3 parameter");
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        System.out.println(name + " " + id + " " + cgpa);
        System.out.println("-----------------------------");
    }

    public void standUp() { // instance method
        System.out.println("Stand up");
    }

    public void showDetails() {
        System.out.println("Student name is " + name + " and id is " + id);
    }
}